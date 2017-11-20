package com.example.manish.recycleviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import com.example.manish.recycleviewexample.Utils.DataSource;
import com.example.manish.recycleviewexample.adapter.PresidentListAdapter;
import com.example.manish.recycleviewexample.model.President;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   static ArrayList<President> presidents_list;
    static RecyclerView.Adapter adapter;
    static RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Presidents List");
        presidents_list= DataSource.getPresidentData();
        recyclerView = (RecyclerView)findViewById(R.id.president_list_view);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(manager);
       // recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new PresidentListAdapter(presidents_list,this);

        recyclerView.setAdapter(adapter);

    }

}
