package com.university.graph;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        Button btnModelImage=findViewById(R.id.btnModelView);

        txtModeTitle.setText(modelTitle);
        txtModeDes.setText(modelDes);
        imgModelFull.setImageResource(imgModel);

        btnModelImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://firebasestorage.googleapis.com/v0/b/graph-54ff0.appspot.com%2Fcatenoid.glb?alt=media";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("googlear://scene-viewer/1?file=" + url));
                intent.setPackage("com.google.android.googlequicksearchbox");
                startActivity(intent);
            }
        });

    }



}
