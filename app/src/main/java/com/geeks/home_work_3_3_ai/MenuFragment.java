package com.geeks.home_work_3_3_ai;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class MenuFragment extends Fragment {

    private RecyclerView rvMenu;
    private ArrayList<String> menuList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        loadData();
        MenuAdapter menuAdapter = new MenuAdapter(menuList);
        rvMenu.setAdapter(menuAdapter);

    }

    private void loadData() {
        menuList.add("Лагман жидкий");
        menuList.add("Лагман жаренный");
        menuList.add("Лагман гуру");
        menuList.add("Бризоль");
        menuList.add("Бифштекс");
        menuList.add("Куурдак");
        menuList.add("Манты");
        menuList.add("Оромо");
        menuList.add("Сорпо");
        menuList.add("Ганфан");
        menuList.add("Гуляш");
        menuList.add("Ассорти");
        menuList.add("Чай");
    }

    private void initView(View view) {
        rvMenu = view.findViewById(R.id.rv_menu);
        rvMenu.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
}