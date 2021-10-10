package com.example.mobileprogramming2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button explicit, implicit, intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explicit = findViewById(R.id.btnExplicit);
        explicit.setOnClickListener(new Click());
        implicit = findViewById(R.id.btnImplicit);
        implicit.setOnClickListener(new Click());
        intent = findViewById(R.id.btnIntent);
        intent.setOnClickListener(new Click());

    }

    public class Click implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnExplicit:
                    Intent explicit = new Intent(MainActivity.this, ActivityfirstExplicit.class);
                    startActivity(explicit);
                    break;
                case R.id.btnImplicit:
                    Intent implicit = new Intent(MainActivity.this, ImplicitIntentActivity.class);
                    startActivity(implicit);
                    break;
                case R.id.btnIntent:
                    Intent intent = new Intent(MainActivity.this, PassingInputActivity.class);
                    startActivity(intent);
                    break;
            }
        }

    }
}