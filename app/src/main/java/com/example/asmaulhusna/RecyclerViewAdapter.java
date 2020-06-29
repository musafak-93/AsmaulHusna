package com.example.asmaulhusna;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecylerViewHolder> {
    List<ActivityAsmaulHusna.User> values;
    Context context1;


    @NonNull
    @Override
    public RecyclerViewAdapter.RecylerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.RecylerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
