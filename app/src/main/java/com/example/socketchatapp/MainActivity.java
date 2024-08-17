package com.example.socketchatapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnClient1 = findViewById(R.id.btnClient1);
        Button btnClient2 = findViewById(R.id.btnClient2);

        btnClient1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Client1Activity.class);
            startActivity(intent);
        });

        btnClient2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Client2Activity.class);
            startActivity(intent);
        });
    }
}
