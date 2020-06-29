package com.example.asmaulhusna;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

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

    private List<User2> getUserInformationn() {
        List<User2> userList = new ArrayList<User2>();
        userList.add(new User2("أشهد أن لا اله الا الله وأشهد ان محمد رسول الله", "Asyhadu an laa ilaaha illallāh wa asyhadu anna Muhammad Rasuulullāh.", "Aku bersaksi bahwa tiada Tuhan melainkan Allah dan Aku bersaksi Nabi Muhammad utusan Allah."));
        userList.add(new User2("اللهُمَّ صَلِّ عَلَى مُحَمَّد     يَارَبِّ صَلِّ عَلَيْهِ وَسَلِّم", "Allahumma sholli ala muhammad ya robbi sholli alaihi wasallim", "Ya Allah, limpahkanlah rahmat atas Nabi Muhammad Ya Tuhanku, limpahkanlah rahmat dan kesejahteraan atas beliau"));
        userList.add(new User2("وَلِلَّهِ الْأَسْمَاءُ الْحُسْنَىٰ فَادْعُوهُ بِهَا ۖ وَذَرُوا الَّذِينَ يُلْحِدُونَ فِي أَسْمَائِهِ ۚ سَيُجْزَوْنَ مَا كَانُوا يَعْمَلُونَ", "Walillahil asmaa-ul husna faad'uuhu bihaa wadzaruul-ladziina yulhiduuna fii asmaa-ihi sayujzauna maa kaanuu ya'maluun(a)", "Hanya milik Allah asmaa-ul husna, maka bermohonlah kepada-Nya dengan menyebut asmaa-ul husna itu dan tinggalkanlah orang-orang yang menyimpang dari kebenaran dalam (menyebut) nama-nama-Nya. Nanti mereka akan mendapat balasan terhadap apa yang telah mereka kerjakan."));

        return userList;
    }

    public class User {
        private String ayat, bacaan, arti, no;

        public String getAyat() {
            return ayat;
        }

        public String getBacaan() {
            return bacaan;
        }

        public String getArti() {
            return arti;
        }

        public String getNo() {
            return no;
        }

        public User(String no, String ayat, String bacaan, String arti) {
            this.no = no;
            this.ayat = ayat;
            this.bacaan = bacaan;
            this.arti = arti;
        }
    }

    public class User2 {
        private String bacaan, arti, bacaanlatin;


        public String getBacaan() {
            return bacaan;
        }

        public String getArti() {
            return arti;
        }

        public String getBacaanLatin() {
            return bacaanlatin;
        }


        public User2(String bacaan, String arti, String bacaanlatin) {
            this.bacaan = bacaan;
            this.arti = arti;
            this.bacaanlatin = bacaanlatin;
        }
    }
}
