package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapters.ItemAdapters;
import model.ItemModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemAdapters adapter;
    List<ItemModel> itemList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize list of items with sample data
        itemList = new ArrayList<>();
        itemList.add(new ItemModel("Item 1", "Descrição 1"));
        itemList.add(new ItemModel("Item 2", "Descrição 2"));

        // Initialize the adapter and connect it to the RecyclerView
        adapter = new ItemAdapters(this, itemList);
        recyclerView.setAdapter(adapter);
    }
}