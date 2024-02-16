package com.geeks.home_work_3_3_ai;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuViewHolder extends RecyclerView.ViewHolder {

    private TextView tvMenu;
    public MenuViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMenu = itemView.findViewById(R.id.tv_menu);
    }

    public void onBind(String menu){
        tvMenu.setText(menu);
    }
}
