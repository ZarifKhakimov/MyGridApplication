package com.example.myjavaapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myjavaapplication.R;
import com.example.myjavaapplication.model.Member;

import java.util.ArrayList;

 public class GridAdapter extends BaseAdapter {

     Context context;
     ArrayList<Member> members;
     LayoutInflater inflter;

     public GridAdapter(Context context, ArrayList<Member> members) {
         this.context = context;
         this.members = members;
         this.inflter = (LayoutInflater.from(context));
     }

     @Override
     public int getCount() {
         return members.size();
     }

     @Override
     public Object getItem(int position) {
         return members.get(position);
     }

     @Override
     public long getItemId(int position) {
         return position;
     }

     @Override
     public View getView(int position, View convertView, ViewGroup parent) {
         convertView = inflter.inflate(R.layout.item_member_list, null);
         ImageView iv_profile = convertView.findViewById(R.id.img_profile);
         TextView tv_fullName = convertView.findViewById(R.id.tv_fullname);

         Member member = members.get(position);

         iv_profile.setImageResource(member.getProfile());
         tv_fullName.setText(member.getFullname());


         return convertView;
     }
 }
