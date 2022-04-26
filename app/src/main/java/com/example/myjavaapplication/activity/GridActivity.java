package com.example.myjavaapplication.activity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myjavaapplication.R;
import com.example.myjavaapplication.adapter.GridAdapter;
import com.example.myjavaapplication.adapter.MemberAdapter;
import com.example.myjavaapplication.model.Member;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        initViews();
    }

    void initViews(){
        gridView = findViewById(R.id.gridview);

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"));
        members.add(new Member(R.drawable.cat1, "Begzodbek"));
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"));
        members.add(new Member(R.drawable.cat1, "Xurshidbek"));
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"));
        members.add(new Member(R.drawable.cat1, "Begzodbek"));
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"));
        members.add(new Member(R.drawable.cat1, "Xurshidbek"));
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"));
        members.add(new Member(R.drawable.cat1, "Begzodbek"));
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"));
        members.add(new Member(R.drawable.cat1, "Xurshidbek"));

        refreshAdapter(members);

    }

    void refreshAdapter(ArrayList<Member> members){
        GridAdapter adapter = new GridAdapter(this, members);
        gridView.setAdapter(adapter);
    }
}
