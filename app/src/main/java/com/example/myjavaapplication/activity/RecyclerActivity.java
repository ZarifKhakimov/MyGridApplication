package com.example.myjavaapplication.activity;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myjavaapplication.R;
import com.example.myjavaapplication.adapter.RecyclerAdapter;
import com.example.myjavaapplication.model.Member;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

   Context context;
   RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        initViews();
    }

    void initViews(){
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"));
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Begzodbek"));
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"));
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"));

        refreshAdapter(members);
    }

    void refreshAdapter(ArrayList<Member> members){
        RecyclerAdapter adapter = new RecyclerAdapter(context, members);
        recyclerView.setAdapter(adapter);
    }
}






