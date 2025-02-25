package com.example.instagram;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayoutManager r ;
    RecyclerView recyclerView;
    ArrayList<Contact> contact = new ArrayList<>();
    RecyclerView recyclerView1;
    ArrayList<Person> person = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView=findViewById(R.id.story);
        r = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(r);
        contact.add(new Contact(R.drawable.ahesan,"Your Story"));
        contact.add(new Contact(R.drawable.darshan,"Darshan Raval"));
        contact.add(new Contact(R.drawable.srkd,"iamsrk"));
        contact.add(new Contact(R.drawable.rohitd,"Rohit Sharma"));
        contact.add(new Contact(R.drawable.salmand,"Salman Khan"));
        contact.add(new Contact(R.drawable.sirajd," Mohammad"));
        contact.add(new Contact(R.drawable.viratd,"Virat Kohli"));
        contact.add(new Contact(R.drawable.arijitd,"Arijit singh "));
        contact.add(new Contact(R.drawable.atif,"Atif Aslam"));
        contact.add(new Contact(R.drawable.j,"Yashasvi"));
        contact.add(new Contact(R.drawable.katrina,"Katrina Kaif"));
        contact.add(new Contact(R.drawable.kirti,"Kritisanon"));
        contact.add(new Contact(R.drawable.moeen,"Moeen Ali"));
        contact.add(new Contact(R.drawable.rashid,"Rashid Khan"));
        contact.add(new Contact(R.drawable.rashmika,"Rashmika"));
        Recycle recycle = new Recycle(this,contact);
        recyclerView.setAdapter(recycle);
        recyclerView1 = findViewById(R.id.post);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        person.add(new Person(R.drawable.salmand,"beingsalmankhan",R.drawable.verified,R.drawable.salmanp));
        person.add(new Person(R.drawable.darshan,"darshanravaldz",R.drawable.verified,R.drawable.darshanp));
        person.add(new Person(R.drawable.rashmika,"rashmika_mandanna",R.drawable.verified,R.drawable.rashmikap));
        person.add(new Person(R.drawable.moeen,"moeenmunirali",R.drawable.verified,R.drawable.moinp));
        person.add(new Person(R.drawable.kirti,"kritisanon",R.drawable.verified,R.drawable.kritip));
        person.add(new Person(R.drawable.katrina,"katrinakaif",R.drawable.verified,R.drawable.katrina));
        person.add(new Person(R.drawable.atif,"atifaslam",R.drawable.verified,R.drawable.atif));
        person.add(new Person(R.drawable.j,"yashasvijaiswal28",R.drawable.verified,R.drawable.jaiswal));
        person.add(new Person(R.drawable.sirajd,"Mohammadsiraj",R.drawable.verified,R.drawable.sirajp));
        person.add(new Person(R.drawable.viratd,"virat.kohli",R.drawable.verified,R.drawable.viratp));
        person.add(new Person(R.drawable.srkd,"iamsrk",R.drawable.verified,R.drawable.srkp));
        person.add(new Person(R.drawable.arijitd,"arijitsingh",R.drawable.verified,R.drawable.arijitd));
        person.add(new Person(R.drawable.rohitd,"rohitsharma45",R.drawable.verified,R.drawable.rohitp));
        RecyclerAdapter adapter = new RecyclerAdapter(this,person);
        recyclerView1.setAdapter(adapter);
    }
}