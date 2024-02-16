package com.geeks.home_work_3_3_ai;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CinemaAdapter extends RecyclerView.Adapter<CinemaViewHolder> {

    private ArrayList<String> cinemaList;
    private Button buttonOne;

    public CinemaAdapter(ArrayList<String> cinemaList) {
        this.cinemaList = cinemaList;
    }

    @NonNull
    @Override
    public CinemaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CinemaViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cinema, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CinemaViewHolder holder, int position) {
        holder.onBind(cinemaList.get(position));


    }

    @Override
    public int getItemCount() {
        return cinemaList.size();
    }




}
