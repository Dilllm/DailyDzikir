package com.example.dailydzikir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MorningDzikir extends AppCompatActivity {


    RecyclerView rv_morning;
    DzikirAdapter adapter;
    ArrayList<ModelDzikir> listdata;
    String[] idDzikir = {
            "dz01",
            "dz02",
            "dz03",
    };

    String[] sArab={
            "",
            "Alhamdulillah",
            "Allahu Akbar",
    };

    String[] sIndo={
            "arti",
            "arti2",
            "arti3",
    };

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning_dzikir);

        listdata=new ArrayList<>();
        rv_morning=findViewById(R.id.rv_morning);
        setData();
        adapter= new DzikirAdapter(listdata);
        rv_morning.setLayoutManager(new LinearLayoutManager(this));
        rv_morning.setAdapter(adapter);

    }
    private void setData(){
        int count=0;
        for (String id:idDzikir){
            listdata.add(new ModelDzikir(id,sArab[count],sIndo[count]));
            count++;

        }
    }
}
