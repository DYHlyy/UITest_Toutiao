package com.example.lyy.uitest_toutiao;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Lyy on 2017/1/2.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private List<Item> mItemList;

    public ItemAdapter(List<Item> itemList) {
        mItemList=itemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        final ViewHolder holder=new ViewHolder(view);
        holder.itemName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position=holder.getAdapterPosition();
                Item item=mItemList.get(position);
                Toast.makeText(view.getContext(),"You click the item:"+item.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item=mItemList.get(position);
        holder.itemName.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }

    static public class ViewHolder extends RecyclerView.ViewHolder {

        View ItemView;
        TextView itemName;

        public ViewHolder(View itemView) {
            super(itemView);
            ItemView=itemView;
            itemName=(TextView)itemView.findViewById(R.id.list_item);
        }
    }
}
