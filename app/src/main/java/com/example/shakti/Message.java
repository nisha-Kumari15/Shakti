package com.example.shakti;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class Message extends AppCompatActivity implements LocationListener {
    LocationManager Manager;
    String Lati, Longi;
    String link;
    SmsManager smsManager;
    EditText num;
    SensorManager sensorManager;
    float acelVal;
    float acelLast;
    float shake;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        text = findViewById(R.id.text);
        num = findViewById(R.id.num);
        smsManager = SmsManager.getDefault();
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensorManager.registerListener(sensorListener, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
        acelVal = SensorManager.GRAVITY_EARTH;
        acelLast = SensorManager.GRAVITY_EARTH;
        shake = 0.0f;
        Manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this,
                        Manifest.permission.ACCESS_COARSE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED) {
            return;
        }
        Manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0,
                0, this::onLocationChanged);


    }

    SensorEventListener sensorListener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent sensorEvent) {
            float x = sensorEvent.values[0];
            float y = sensorEvent.values[1];
            float z = sensorEvent.values[2];
            acelLast = acelVal;
            acelVal = (float) Math.sqrt((double) x*x + y*y + z*z);
            float delta = acelVal - acelLast;
            shake = shake * 0.9f + delta;


            if(shake > 12){
                String msg = num.getText().toString();
                SharedPreferences shrd = getSharedPreferences("data", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.putString("str",msg);
                editor.apply();
                text.setText(msg);
                link="https://www.google.co.in/maps/dir///@"+Lati+","+Longi+",4z";
                String message = "Hello I am in trouble at this location\n"+link;
                smsManager.sendTextMessage(msg, "", message, null,
                        null);
                Toast.makeText(Message.this, "Message Delivered", Toast.LENGTH_SHORT).show();

            }


            SharedPreferences getShared = getSharedPreferences("data",Context.MODE_PRIVATE);
            String value = getShared.getString("str"," ");
            text.setText(value);



        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    };

    @Override
    public void onLocationChanged(@NonNull Location location) {
        Toast.makeText(this, "Location Detected", Toast.LENGTH_SHORT).show();
        Lati = "" + location.getLatitude();
        Longi = "" + location.getLongitude();
    }

}
