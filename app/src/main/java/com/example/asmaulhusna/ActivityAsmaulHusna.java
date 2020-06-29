package com.example.asmaulhusna;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ActivityAsmaulHusna extends AppCompatActivity {

    RecyclerView recyclerView, recyclerView1;
    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerViewAdapterBacaan recyclerViewAdapterBacaan;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    RecyclerView.LayoutManager recyclerViewLayoutManager1;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmaul_husna);
        setTitle("Asmaul Husna");

        mediaPlayer = MediaPlayer.create(ActivityAsmaulHusna.this, R.raw.asmaul_husna);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView1 = (RecyclerView) findViewById(R.id.recycler_view1);
        recyclerView.setNestedScrollingEnabled(true);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 1);
        recyclerViewLayoutManager.setAutoMeasureEnabled(true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter);

        recyclerViewLayoutManager1 = new GridLayoutManager(this, 1);
        recyclerViewLayoutManager1.setAutoMeasureEnabled(true);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(recyclerViewLayoutManager1);
        recyclerViewAdapterBacaan = new RecyclerViewAdapterBacaan(getApplicationContext(), getUserInformationn());
        recyclerView1.setAdapter(recyclerViewAdapterBacaan);

    }
}
