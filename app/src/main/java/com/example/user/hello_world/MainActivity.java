package com.example.user.hello_world;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    private List<Product> list =  new ArrayList<Product>();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillData();
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_main);
        System.out.println(list.get(1).name);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        RecyclerAdapter mAdapter = new RecyclerAdapter(MainActivity.this, list);
        mRecyclerView.setAdapter(mAdapter);

        }




    void fillData() {
        for (int i = 1; i <= 300; i++) {
            list.add(new Product("NAME"+i,1000+i,false));
        }

    }
}
