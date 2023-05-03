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

    /** STEP ONE **/

    // Context and List of objects must be passed to the Adapter.
    Context context;
    List<Employee> list;

    public MainAdapter(Context context, List<Employee> list) {
        this.context = context;
        this.list = list;
    }

    /** STEP TWO **/

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Here we pass the ViewHolder that contains the Views of the item.
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false));
    }

    /** STEP FOUR **/

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // This is the current object in the list. (position is 0 at the beginning and increase until the size of the list)
        Employee current = list.get(position);

        // Here we fill the data of the item with the current object in the list.
        holder.name.setText("Name : " + current.name);
        holder.jobTitle.setText("Job Title : " + current.jobTitle);
        holder.salary.setText("Salary : " + current.salary + " $");
        Glide.with(holder.img).load(current.img).into(holder.img);
    }

    /** STEP TWO **/

    @Override
    public int getItemCount() {
        // Return the size of the list of objects.
        return list.size();
    }

    /** STEP THREE **/

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Here we declare the views inside the item. (TextViews, ImageViews... etc)
        TextView name;
        TextView jobTitle;
        TextView salary;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
             // Get each View by its id.
             name = itemView.findViewById(R.id.name);
             jobTitle = itemView.findViewById(R.id.job_title);
             salary = itemView.findViewById(R.id.salary);
             img = itemView.findViewById(R.id.img);
        }
    }
}
