package com.example.asmaulhusna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecylerViewHolder> {
    List<ActivityAsmaulHusna.User> values;
    Context context1;



    @Override
    public RecyclerViewAdapter(Context context, List<ActivityAsmaulHusna.User> userInformation) {
        context = context;
        values = userInformation;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_layout_asmaul_husna, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.RecylerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
