package com.university.graph;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewViewHolder> {

    Context context;
    List<CardItem> cardItems;

    public RecyclerviewAdapter(Context context, List<CardItem> cardItems) {
        this.context = context;
        this.cardItems = cardItems;
    }

    @NonNull
    @Override
    public RecyclerviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecyclerviewViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewViewHolder holder, int position) {
        holder.thumbnail.setImageResource(cardItems.get(position).getImage());
        holder.name.setText(cardItems.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return cardItems.size();
    }
}
