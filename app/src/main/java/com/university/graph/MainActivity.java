package com.university.graph;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);


        List<CardItem> cardItems = new ArrayList<>();
        cardItems.add(new CardItem(R.drawable.card_thumbnail_catenoid,R.string.catenoid));
        cardItems.add(new CardItem(R.drawable.card_thumbnail_catenoid,R.string.catenoid));
        cardItems.add(new CardItem(R.drawable.card_thumbnail_catenoid,R.string.catenoid));
        cardItems.add(new CardItem(R.drawable.card_thumbnail_catenoid,R.string.catenoid));
        cardItems.add(new CardItem(R.drawable.card_thumbnail_catenoid,R.string.catenoid));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerviewAdapter(getApplicationContext(),cardItems));

    }
}