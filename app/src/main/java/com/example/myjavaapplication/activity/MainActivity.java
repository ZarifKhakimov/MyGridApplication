package com.example.myjavaapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myjavaapplication.R;

public class MainActivity extends AppCompatActivity {
    private Object TwitterClone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        Button b = findViewById(R.id.b_push);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openRecyclerActivity();
            }
        });
    }

//    void openMainActivity(){
//        Intent intent = new Intent(this, DetailActivity.class);
//        startActivity(intent);
//    }

    void openRecyclerActivity(){
        Intent intent = new Intent(this, GridActivity.class);
        startActivity(intent);
    }
}