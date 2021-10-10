package com.example.mobileprogramming2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ActivityfirstExplicit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        findViewById(R.id.btnExplicit).setOnClickListener(v -> {
            Intent i = new Intent(ActivityfirstExplicit.this, explicit2.class);
            startActivity(i);
        });
    }
}