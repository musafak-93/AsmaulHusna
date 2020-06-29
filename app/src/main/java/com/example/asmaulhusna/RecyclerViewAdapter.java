package com.example.asmaulhusna;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecylerViewHolder> {
    List<ActivityAsmaulHusna.User> values;
    Context context1;


    public RecyclerViewAdapter(Context context, List<ActivityAsmaulHusna.User> userInformation) {
        context1 = context;
        values = userInformation;
    }

    @Override
    public RecylerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_layout_asmaul_husna, parent, false);
        return new RecylerViewHolder(view);
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
    public int getItemCount() { return values.size();}

    public class RecylerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView ayat, bacaan, arti, no;
        CardView cardView;
        LinearLayout linearLayout;

        public RecylerViewHolder(View itemView) {
            super(itemView);
            ayat = (TextView) itemView.findViewById(R.id.tv_ayat);
            bacaan = (TextView) itemView.findViewById(R.id.tv_bacaan);
            arti = (TextView) itemView.findViewById(R.id.tv_arti);
            no = (TextView) itemView.findViewById(R.id.tv_no);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.tes);
        }

        @Override
        public void onClick(View view){

        }
    }
}
