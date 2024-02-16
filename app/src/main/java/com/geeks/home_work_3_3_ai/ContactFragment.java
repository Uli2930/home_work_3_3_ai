package com.geeks.home_work_3_3_ai;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeks.home_work_3_3_ai.databinding.FragmentContactBinding;

import java.util.ArrayList;


public class ContactFragment extends Fragment {

    private FragmentContactBinding binding;
    private ArrayList<String> contactList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContactBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loaData();
        ContactAdapter adapter = new ContactAdapter(contactList);
        binding.rvContacts.setAdapter(adapter);
    }

    private void loaData() {
        contactList.add("Айдай");
        contactList.add("Режеп");
        contactList.add("Арзу");
        contactList.add("Апа");
        contactList.add("Кутман");
        contactList.add("Адилет");
        contactList.add("Сезим");
        contactList.add("Урмат");
        contactList.add("Кайрат");
        contactList.add("Ажар эже");
        contactList.add("Таажене");
        contactList.add("Азиз кошуна");
        contactList.add("Азамат");
        contactList.add("Мээрим");
        contactList.add("Нурболот");
        contactList.add("Алтын");
    }
}