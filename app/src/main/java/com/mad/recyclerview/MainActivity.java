package com.mad.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<RecylerModel> recyclerModels= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=findViewById(R.id.viewer);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent signup = new Intent(MainActivity.this,Broadpeakinfo.class);
                startActivity(signup);
            }
        });

        initView();
        setAdapter();


    }

    private void setAdapter() {
        LinearLayoutManager layoutManager= new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        if(recyclerAdapter==null)
        {
            prepareData();
            recyclerAdapter= new RecyclerAdapter(MainActivity.this,recyclerModels);
        }
        recyclerView.setAdapter(recyclerAdapter);
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
    }
    private void prepareData()
    {
        recyclerModels.add(new RecylerModel("BroadPeak  Techonology","Islamabad " ));

        recyclerModels.add(new RecylerModel("TED","Rawalpindi" ));
        recyclerModels.add(new RecylerModel("DPL","Islamabad" ));
        recyclerModels.add(new RecylerModel("Axcat","Rawalpindi" ));
        recyclerModels.add(new RecylerModel("BroadPeak  Techonology","Islamabad " ));
        recyclerModels.add(new RecylerModel("TED","Rawalpindi" ));
        recyclerModels.add(new RecylerModel("DPL","Islamabad" ));
        recyclerModels.add(new RecylerModel("Axcat","Rawalpindi" ));
        recyclerModels.add(new RecylerModel("BroadPeak  Techonology","Islamabad " ));
        recyclerModels.add(new RecylerModel("TED","Rawalpindi" ));
        recyclerModels.add(new RecylerModel("DPL","Islamabad" ));
        recyclerModels.add(new RecylerModel("Axcat","Rawalpindi" ));

    }

}
