package com.university.graph;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerviewViewHolder extends RecyclerView.ViewHolder{

    ImageView thumbnail;
    TextView name;


    public RecyclerviewViewHolder(@NonNull View itemView) {
        super(itemView);
        thumbnail = itemView.findViewById(R.id.image_view);
        name = itemView.findViewById(R.id.text_view);
    }
}

