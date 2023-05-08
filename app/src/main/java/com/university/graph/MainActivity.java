package com.university.graph;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ModelItemsInterface {

    ArrayList<ModelItem> modelItems = new ArrayList<>();
    int []model_Images={R.drawable.catenoid,R.drawable.ellipsoid,R.drawable.helicoid,R.drawable.hyperbolic_paraboloid,R.drawable.hyperboloid,R.drawable.mobius_strip,R.drawable.paraboloid,R.drawable.torus};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        setCardItems();
        recyclerView.setAdapter(new ModelItemsAdapter(getApplicationContext(),modelItems,this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    public void setCardItems(){

        String []modelName=getResources().getStringArray(R.array.txtModel_Types);
        String []model_Desc=getResources().getStringArray(R.array.txtModel_Des);
        for(int i=0;i<modelName.length;i++){
            modelItems.add(new ModelItem(model_Images[i],modelName[i],model_Desc[i]));
        }
    }



    @Override
    public void onItemClick(int position) {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("MODEL_IMG",modelItems.get(position).getModelImage());
        intent.putExtra("NAME",modelItems.get(position).getModelName());
        intent.putExtra("MODEL_DESC",modelItems.get(position).getModelDescription());


        startActivity(intent);
    }
}