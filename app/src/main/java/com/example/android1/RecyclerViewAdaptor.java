package com.example.android1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1.databinding.Task2Binding;

public class RecyclerViewAdaptor extends RecyclerView.Adapter<RecyclerViewAdaptor.Holder> {


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Task2Binding binding = Task2Binding.inflate(LayoutInflater.from(parent.getContext()));
        return new Holder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class Holder extends RecyclerView.ViewHolder
    {
        public Holder(@NonNull Task2Binding itemView) {
            super(itemView.getRoot());
        }

    }
}
