package com.university.graph;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
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

        txtModeTitle.setText(modelTitle);
        txtModeDes.setText(modelDes);
        imgModelFull.setImageResource(imgModel);


    }
}
