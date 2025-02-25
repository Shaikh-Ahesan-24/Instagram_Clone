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

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Holder> {
    Context contexts;
    ArrayList<Person> persons;
    public RecyclerAdapter(Context contexts,ArrayList<Person>persons){
        this.contexts=contexts;
        this.persons=persons;
    }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(contexts).inflate(R.layout.post,parent,false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
          holder.imageView.setImageResource(persons.get(position).img);
          holder.textView.setText(persons.get(position).post);
          holder.imageView1.setImageResource(persons.get(position).img1);
          holder.imageView2.setImageResource(persons.get(position).img2);

    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public static class Holder extends RecyclerView.ViewHolder{
           ImageView imageView;
           TextView textView;
           ImageView imageView1;
           ImageView imageView2;


        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.dp);
            textView=itemView.findViewById(R.id.name);
            imageView1=itemView.findViewById(R.id.tick);
            imageView2 = itemView.findViewById(R.id.extra);


        }
    }

}
