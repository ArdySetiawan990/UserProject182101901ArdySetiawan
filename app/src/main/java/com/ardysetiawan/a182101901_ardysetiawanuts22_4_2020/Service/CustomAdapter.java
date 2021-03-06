package com.ardysetiawan.a182101901_ardysetiawanuts22_4_2020.Service;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ardysetiawan.a182101901_ardysetiawanuts22_4_2020.model.User;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>{
    private List<User> dataList;
    private Context context;

    public CustomAdapter(Context context, List<User> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    class CustomViewHolder extends RecyclerView.ViewHolder{
        public final View mView;

        private TextView nameView;

        CustomViewHolder(View itemView){
            super(itemView);
            mView = itemView;
            nameView = mView.findViewById(R.id.name);
        }
    }

    @Override
    public CustomAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.CustomViewHolder holder, int position) {
        String name = dataList.get(position).getName();
        holder.nameView.setText(name);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}