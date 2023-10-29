package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.DataViewHolder> {
    private Context context;
    private List<Items> dataList;

    public AdapterData(Context context, List<Items> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_data, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        Items items = dataList.get(position);
        holder.textViewName.setText(items.getName());
        holder.imageViewAvatar.setImageResource(items.getImageId());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewAvatar;
        TextView textViewName;

        public DataViewHolder(View itemView) {
            super(itemView);
            imageViewAvatar = itemView.findViewById(R.id.imageViewAvatar);
            textViewName = itemView.findViewById(R.id.textViewName);
        }
    }
}
