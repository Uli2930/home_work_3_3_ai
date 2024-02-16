package com.geeks.home_work_3_3_ai;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CinemaViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCinema;
    public CinemaViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCinema = itemView.findViewById(R.id.tv_cinema);
    }

    public void onBind(String cinema){
        tvCinema.setText(cinema);
    }
}
