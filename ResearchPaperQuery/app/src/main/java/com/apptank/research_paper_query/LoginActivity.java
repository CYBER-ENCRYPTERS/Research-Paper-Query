package com.apptank.research_paper_query;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button1 = findViewById(R.id.facebook);
        button2 = findViewById(R.id.google);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_fb();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_google();
            }
        });

    }
        public void openActivity_fb(){
            Intent intent = new Intent(this , facebook_login.class);
            startActivity(intent);
        }

        public void openActivity_google(){
        Intent intent = new Intent(this, google_login.class);
        startActivity(intent);
        }

    }

