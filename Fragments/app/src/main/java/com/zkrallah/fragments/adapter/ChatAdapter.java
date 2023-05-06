package com.zkrallah.fragments.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.zkrallah.fragments.R;
import com.zkrallah.fragments.model.Chat;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    /** STEP ONE **/

    // Context and List of objects must be passed to the Adapter.
    List<Chat> list;
    Context context;

    public ChatAdapter(List<Chat> list, Context context) {
        this.list = list;
        this.context = context;
    }

    /** STEP TWO **/

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Here we pass the ViewHolder that contains the Views of the item.
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.chat_item, parent, false));
    }

    /** STEP FOUR **/

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // This is the current object in the list. (position is 0 at the beginning and increase until the size of the list)
        Chat current = list.get(position);

        // Here we fill the data of the item with the current object in the list.
        holder.name.setText(current.getName());
        holder.message.setText(current.getMessage());
        Glide.with(holder.img).load(current.getImg()).into(holder.img);
    }

    /** STEP TWO **/

    @Override
    public int getItemCount() {
        // Return the size of the list of objects.
        return list.size();
    }

    /** STEP THREE **/

    static class ViewHolder extends RecyclerView.ViewHolder{
        // Here we declare the views inside the item. (TextViews, ImageViews... etc)
        TextView name;
        TextView message;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Get each View by its id.
            name = itemView.findViewById(R.id.name);
            message = itemView.findViewById(R.id.message);
            img = itemView.findViewById(R.id.img);

        }
    }
}
