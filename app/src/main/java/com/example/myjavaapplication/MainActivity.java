package com.example.myjavaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Object TwitterClone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        initViews();
    }

    void initViews(){
        Button b = findViewById(R.id.b_push);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
    }

    void openMainActivity(){
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}