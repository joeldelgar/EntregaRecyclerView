package com.example.entrega4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Track> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        songs = new ArrayList<>();
        songs.add(new Track("Out of the Black", "Royal Blood"));
        songs.add(new Track("La Raja de Tu Falda", "Estopa"));
        songs.add(new Track("Physical", "Dua Lipa"));
        songs.add(new Track("Elephant", "Tame Impala"));
        songs.add(new Track("Icky Thump", "The Withe Stripes"));
        songs.add(new Track("Grace Kelly", "Mika"));
        songs.add(new Track("Beggin", "Maneskin"));
        songs.add(new Track("Master of Puppets", "Metallica"));
        songs.add(new Track("Benvolgut", "Manel"));

        ListAdapter listAdapter = new ListAdapter(songs, this);
        RecyclerView recyclerView = findViewById(R.id.ListRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}