package com.example.hp.recyclerview02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Contact> contactArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


// hihi
    }
    private void init(){
        recyclerView = (RecyclerView) findViewById(R.id.rcy_Contact);
        Contact contact= new Contact("thao dep trai","12345");
//        Contact contact01= new Contact("thao dep trai","12345");
        Contact contact02= new Contact("thao dep hand some","12345");
        Contact contact03= new Contact("thao dep nothing here","12345");
        contactArrayList= new ArrayList<Contact>();
        contactArrayList.add(contact);
//        contactArrayList.add(contact01);
        contactArrayList.add(contact02);
        contactArrayList.add(contact03);
        ContactAdapter adapter= new ContactAdapter(contactArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.notifyDataSetChanged();
//        adapter.notifyItemInserted(0);


    }
}
