package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Create a list of Contacts
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Saugat Malla", "9808011122", R.drawable.saugat));
        contactsList.add(new Contacts("Rajesh Hamal", "9823555322", R.drawable.rajesh));
        contactsList.add(new Contacts("Dayahang Rai", "9823567921", R.drawable.dahayang));
        contactsList.add(new Contacts("Bhuwan KC", "9812467393", R.drawable.bhuwan));

        //Pass list to the Adapter class
        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,
                false));
        // while setting LinearLayoutManageer.HORIZONTAL, make sure that in
        // contact.xml add -> android:layout_width="wrap_content"
    }
}
