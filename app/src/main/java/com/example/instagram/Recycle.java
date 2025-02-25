package com.example.instagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycle extends RecyclerView.Adapter<Recycle.ViewHolder> {
 Context context;
 ArrayList<Contact> contacts;
 public Recycle(Context context,ArrayList<Contact> contacts){
     this.context=context;
    this.contacts = contacts;
 }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.story,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(contacts.get(position).img);
        holder.textView.setText(contacts.get(position).status);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
          ImageView imageView;
          TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.person);
            textView=itemView.findViewById(R.id.status);
        }
    }
}
