package com.example.asmaulhusna;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.codesgood.views.JustifiedTextView;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class ActivityAsmaulHusnaDetail extends AppCompatActivity {
    TextView ayat, arti;
    JustifiedTextView keterangan, meneladani;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmaul_husna_detail);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collab);
        collapsingToolbar.setExpandedTitleGravity(Gravity.BOTTOM);

        ayat = (TextView) findViewById(R.id.tv_ayat);
        arti = (TextView) findViewById(R.id.tv_arti);
        keterangan = (JustifiedTextView) findViewById(R.id.keterangan);
        meneladani = (JustifiedTextView) findViewById(R.id.meneladani);

        Intent mIntent = getIntent();
        int position = mIntent.getIntExtra("position", 0);
        String ayat1 = mIntent.getStringExtra("ayat");
        String bacaan = mIntent.getStringExtra("bacaan");
        String arti1 = mIntent.getStringExtra("arti");
    }
}
