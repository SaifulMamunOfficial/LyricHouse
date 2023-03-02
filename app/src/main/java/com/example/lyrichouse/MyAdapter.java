package com.example.lyrichouse;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder> {

    private ArrayList<MyModel> Models;

    public MyAdapter(ArrayList<MyModel> models) {
        Models = models;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View View = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lyricist_single,parent,false);

        return new myViewHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.ImageView.setImageResource(Models.get(position).getImageRes());
        holder.Name.setText(Models.get(position).getName());
        holder.Details.setText(Models.get(position).getDetails());

    }

    @Override
    public int getItemCount() {
        return Models.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        ImageView ImageView;
        TextView Name, Details;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            ImageView = itemView.findViewById(R.id.Lyricist_icon);
            Name = itemView.findViewById(R.id.lyric_Title);
            Details = itemView.findViewById(R.id.Lyric_details);

        }
    }

}
