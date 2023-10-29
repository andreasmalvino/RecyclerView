package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterData adapterData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Items> dataList = new ArrayList<>();
        dataList.add(new Items("Beng Beng", R.drawable.bengbeng));
        dataList.add(new Items("Better", R.drawable.better));
        dataList.add(new Items("Chitato", R.drawable.chitato));
        dataList.add(new Items("Chocopie", R.drawable.chochopie));
        dataList.add(new Items("Fullo", R.drawable.fullo));
        dataList.add(new Items("Mie Sakura", R.drawable.misakura));
        dataList.add(new Items("O Donuts", R.drawable.odonuts));
        dataList.add(new Items("Pocky", R.drawable.pocky));
        dataList.add(new Items("Sugus", R.drawable.sugus));
        dataList.add(new Items("Sukro", R.drawable.sukro));
        dataList.add(new Items("Tic Tac", R.drawable.tictac));
        dataList.add(new Items("Twistko", R.drawable.twistko));

        adapterData = new AdapterData(this, dataList);
        recyclerView.setAdapter(adapterData);


        adapterData = new AdapterData(this, dataList);
        recyclerView.setAdapter(adapterData);
    }
}
