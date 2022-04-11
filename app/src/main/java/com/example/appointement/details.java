package com.example.appointement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class details extends AppCompatActivity {
     private Button book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setTitle("Details");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Button book =findViewById(R.id.book);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(details.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}