package com.zkrallah.adapterdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    Context context;
    List<Employee> list;

    public MainAdapter(Context context, List<Employee> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText("Name : " + list.get(position).name);
        holder.jobTitle.setText("Job Title : " + list.get(position).jobTitle);
        holder.salary.setText("Salary : " + list.get(position).salary + " $");
        Glide.with(holder.img).load(list.get(position).img).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView jobTitle;
        TextView salary;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
             name = itemView.findViewById(R.id.name);
             jobTitle = itemView.findViewById(R.id.job_title);
             salary = itemView.findViewById(R.id.salary);
             img = itemView.findViewById(R.id.img);
        }
    }
}
