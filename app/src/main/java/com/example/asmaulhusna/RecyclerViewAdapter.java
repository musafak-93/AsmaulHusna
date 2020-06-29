package com.example.asmaulhusna;

import android.content.Context;
import android.content.Intent;
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
    public void onBindViewHolder( final RecylerViewHolder holder, final int position) {
        holder.no.setText(values.get(position).getNo());
        holder.ayat.setText(values.get(position).getAyat());
        holder.bacaan.setText(values.get(position).getBacaan());
        holder.arti.setText(values.get(position).getArti());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(context1, ActivityAsmaulHusnaDetail.class);
                myIntent.putExtra("position", position);
                myIntent.putExtra("ayat", values.get(position).getAyat());
                myIntent.putExtra("bacaan", values.get(position).getBacaan());
                myIntent.putExtra("arti", values.get(position).getArti());
                view.getContext().startActivity(myIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
