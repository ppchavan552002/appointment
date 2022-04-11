package com.example.appointement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "322", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Date.class);
                startActivity(intent);
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "322", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Date.class);

                startActivity(intent);
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "322", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Date.class);

                startActivity(intent);
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "322", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Date.class);

                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
        super.onBackPressed();
    }
}