package com.example.daftarnamaikan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NamaIkanAdapter namaIkanAdapter;
    private ArrayList<HomeModel>dataIkanAraylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
        recyclerView = findViewById(R.id.rc_view);
        namaIkanAdapter = new NamaIkanAdapter(dataIkanAraylist);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(namaIkanAdapter);
    }

    public void getData(){
        dataIkanAraylist = new ArrayList<>();
        dataIkanAraylist.add(new HomeModel("Cupang","Hitam"));
        dataIkanAraylist.add(new HomeModel("Oscar","Merah"));
        dataIkanAraylist.add(new HomeModel("Arwana","Kuning"));
        dataIkanAraylist.add(new HomeModel("Gupy","Red slayer"));
        dataIkanAraylist.add(new HomeModel("Neon Fish","Blue Electric"));
        dataIkanAraylist.add(new HomeModel("Main fish","Hitam loreng"));
        dataIkanAraylist.add(new HomeModel("Komet","Red Slayer"));
    }

}