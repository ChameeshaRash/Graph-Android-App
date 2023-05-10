package com.university.graph;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity implements ModelItemsInterface {

    ArrayList<ModelItem> modelItems = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_layout);

        int imgModel=getIntent().getIntExtra("MODEL_IMG",0);
        String modelTitle=getIntent().getStringExtra("NAME");
        String modelDes=getIntent().getStringExtra("MODEL_DESC");


        TextView txtModeTitle=findViewById(R.id.modelTitle);
        TextView txtModeDes=findViewById(R.id.modelDescription);
        ImageView imgModelFull=findViewById(R.id.modelImage);
        Button btnModelImage=findViewById(R.id.btnModelView);

        txtModeTitle.setText(modelTitle);
        txtModeDes.setText(modelDes);
        imgModelFull.setImageResource(imgModel);

        btnModelImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onItemClick(imgModel);
            }
        });



    }


    @Override
    public void onItemClick(int position) {
        Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("URL_MODEL_IMG",modelItems.get(position).getUrlModelName());
        startActivity(intent);
    }
}
