package com.example.myjavaapplication.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myjavaapplication.R;
import com.example.myjavaapplication.adapter.MemberAdapter;
import com.example.myjavaapplication.model.Member;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initViews();
    }

    void initViews(){
        listView = findViewById(R.id.listView);

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"));
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Begzodbek"));
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"));
        members.add(new Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"));

        refreshAdapter(members);

    }

    void refreshAdapter(ArrayList<Member> members){
        MemberAdapter adapter = new MemberAdapter(this, members);
        listView.setAdapter(adapter);
    }
}
