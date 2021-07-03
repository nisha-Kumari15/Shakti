package com.example.shakti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    CardView Delhi, UttarPradesh, MadhyaPradesh, Uttrakhand, Jharkhand, ArunachalPradesh,  Punjab, Bihar, Haryana, Goa, HimachalPradesh,
            Mizoram, Manipur, Nagaland, Tripura, Mumbai, Orissa, Chattisgarh, WestBengal, Kerala, Karnataka, TamilNadu, Telangana, JammuKashmir, Gujarat, Rajasthan,
            Meghalaya, Sikkim, Assam, AndhraPradesh ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Delhi = findViewById(R.id.Delhi);
        UttarPradesh = findViewById(R.id.UttarPradesh);
        MadhyaPradesh = findViewById(R.id.MadhyaPradesh);
        Uttrakhand = findViewById(R.id.Uttrakhand);
        Jharkhand = findViewById(R.id.Jharkhand);
        ArunachalPradesh = findViewById(R.id.ArunachalPradesh);
        Punjab = findViewById(R.id.Punjab);
        Bihar = findViewById(R.id.Bihar);
        Haryana = findViewById(R.id.Haryana);
        Goa = findViewById(R.id.Goa);
        HimachalPradesh = findViewById(R.id.HimachalPradesh);
        Mizoram = findViewById(R.id.Mizoram);
        Manipur = findViewById(R.id.Manipur);
        Nagaland = findViewById(R.id.Nagaland);
        Tripura = findViewById(R.id.Tripura);
        Mumbai = findViewById(R.id.Mumbai);
        Chattisgarh = findViewById(R.id.Chattisgarh);
        WestBengal = findViewById(R.id.WestBengal);
        Karnataka = findViewById(R.id.Karnataka);
        Kerala = findViewById(R.id.Kerala);
        TamilNadu = findViewById(R.id.TamilNadu);
        Telangana = findViewById(R.id.Telangana);
        Sikkim = findViewById(R.id.Sikkim);
        JammuKashmir = findViewById(R.id.JammuKashmir);
        Gujarat = findViewById(R.id.Gujarat);
        Rajasthan = findViewById(R.id.Rajasthan);
        Meghalaya = findViewById(R.id.Meghalaya);
        Assam = findViewById(R.id.Assam);
        Orissa = findViewById(R.id.Orissa);
        AndhraPradesh = findViewById(R.id.AndhraPradesh);

        Delhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        MadhyaPradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Goa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Gujarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Rajasthan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        AndhraPradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        ArunachalPradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Assam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Mizoram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Meghalaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Manipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Nagaland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        WestBengal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Orissa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Bihar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Jharkhand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Kerala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Karnataka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Telangana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        TamilNadu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Punjab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Sikkim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Tripura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        JammuKashmir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        HimachalPradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Haryana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Chattisgarh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Gujarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        Uttrakhand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
        UttarPradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this, Message.class);
                startActivity(i);
            }
        });
    }

}