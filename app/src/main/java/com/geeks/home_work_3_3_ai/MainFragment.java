package com.geeks.home_work_3_3_ai;

import android.content.Intent;
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


public class MainFragment extends Fragment {

    private RecyclerView rvCinema;
    private ArrayList<String> cinemaList = new ArrayList<>();
    private Button buttonOne;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        loadData();
        CinemaAdapter cinemaAdapter = new CinemaAdapter(cinemaList);
        rvCinema.setAdapter(cinemaAdapter);

    }

    private void loadData() {
        cinemaList.add("Один дома");
        cinemaList.add("Один дома 2");
        cinemaList.add("Один дома 3");
        cinemaList.add("Один дома 4");
        cinemaList.add("Вонка");
        cinemaList.add("Вызов");
        cinemaList.add("Мотылёк");
        cinemaList.add("Искупление");
        cinemaList.add("Наполеон");
        cinemaList.add("Пчеловод");
        cinemaList.add("Холоп");
        cinemaList.add("Холоп 2");
    }

    private void initView(View view) {
        rvCinema = view.findViewById(R.id.rv_cinema);
        rvCinema.setLayoutManager(new LinearLayoutManager(requireContext()));
    }



}
