package com.university.graph;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ModelItemsAdapter extends RecyclerView.Adapter<ModelItemsAdapter.ViewHolder> {
private  final ModelItemsInterface modelItemsInterface;
    private Context context;
    private  List<ModelItem> modelItems;
    private LayoutInflater inflater;

    public ModelItemsAdapter(Context context, List<ModelItem> modelItems,ModelItemsInterface modelItemsInterface) {
        this.context = context;
        this.modelItems = modelItems;
        this.inflater=LayoutInflater.from(context);
        this.modelItemsInterface=modelItemsInterface;
    }



    @NonNull
    @Override
    public ModelItemsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ModelItemsAdapter.ViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view_item,parent,false),modelItemsInterface);

    }

    @Override
    public void onBindViewHolder(@NonNull ModelItemsAdapter.ViewHolder holder,final int position) {
        holder.iconImage.setImageResource(modelItems.get(position).getModelImage());
        holder.itemName.setText(modelItems.get(position).getModelName());
    }

    @Override
    public int getItemCount() {
        return modelItems.size();
    }



    public void setItems(List<ModelItem> items){
        modelItems=items;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView itemName;
        public ViewHolder(View itemView,ModelItemsInterface modelItemsInterface){
            super(itemView);
            iconImage=itemView.findViewById(R.id.image_view);
            itemName=itemView.findViewById(R.id.nameText_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(modelItemsInterface !=null){
                        int pos=getAdapterPosition();
                        if(pos!=RecyclerView.NO_POSITION){
                            modelItemsInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }

    }
}
