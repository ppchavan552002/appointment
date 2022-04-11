package com.example.appointement;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Date extends AppCompatActivity {
     private Button button5;
     RadioButton radioButton,radioButton2,radioButton3,radioButton4,radioButton5,radioButton6,radioButton7,radioButton8,radioButton9,radioButton10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("tool bar");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("Appointement Date");

        Button button5 =findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Date.this, "34", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Date.this,details.class);
                startActivity(intent);
            }
        });
    }
}