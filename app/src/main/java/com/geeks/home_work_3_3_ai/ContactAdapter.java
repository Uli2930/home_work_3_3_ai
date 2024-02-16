package com.geeks.home_work_3_3_ai;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.home_work_3_3_ai.databinding.ItemContactBinding;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private ArrayList<String> contactList;

    public ContactAdapter(ArrayList<String> contactList) {
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(ItemContactBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.onBind(contactList.get(position));
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
}

class ContactViewHolder extends RecyclerView.ViewHolder {

    private ItemContactBinding binding;

    public ContactViewHolder(@NonNull ItemContactBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(String contact){
        binding.tvContact.setText(contact);
    }
}
