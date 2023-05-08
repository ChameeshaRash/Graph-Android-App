package com.university.graph;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<ModelItem> modelItems = new ArrayList<>();
    int []model_Images={R.drawable.catenoid,R.drawable.ellipsoid,R.drawable.helicoid,R.drawable.hyperbolic_paraboloid,R.drawable.hyperboloid,R.drawable.mobius_strip,R.drawable.paraboloid,R.drawable.torus};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        setCardItems();
        recyclerView.setAdapter(new ModelItemsAdapter(getApplicationContext(),modelItems));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    public void setCardItems(){

        String []modelName=getResources().getStringArray(R.array.txtModel_Types);
        for(int i=0;i<modelName.length;i++){
            modelItems.add(new ModelItem(model_Images[i],modelName[i]));
        }
    }
}