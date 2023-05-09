package com.university.graph;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ModelItemsInterface {

    ArrayList<ModelItem> modelItems = new ArrayList<>();
    int []model_Images={R.drawable.catenoid,R.drawable.ellipsoid,R.drawable.helicoid,R.drawable.hyperbolic_paraboloid,R.drawable.hyperboloid,R.drawable.mobius_strip,R.drawable.paraboloid,R.drawable.torus};
    SearchView searchView;
    ModelItemsAdapter adapter;
    RecyclerView recyclerView;
    ArrayList<ModelItem> filteredList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //for searching
        searchView=findViewById(R.id.search_view);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
//                filterList(newText,getApplicationContext(),modelItems, adapter.modelItemsInterface);
                return true;
            }
        });

        recyclerView = findViewById(R.id.recycler_view);
        setCardItems();
        adapter = new ModelItemsAdapter(getApplicationContext(), modelItems, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    //filterList method
    public void filterList(String text) {

        filteredList = new ArrayList<>();
        for (ModelItem modelItem : modelItems) {
            if (modelItem.getModelName().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(modelItem);
            }
        }
        if (filteredList.isEmpty()) {
            Toast.makeText(this, "No data found", Toast.LENGTH_SHORT).show();
        } else {
            ModelItemsAdapter adapter = new ModelItemsAdapter(getApplicationContext(), modelItems, this);
            adapter.setFilteredList(filteredList);
            recyclerView.setAdapter(adapter);
        }
    }

    //setCardItems method

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