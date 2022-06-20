package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ContactsAdapter extends ArrayAdapter<Contacts> {



    private  final int resource;

    public ContactsAdapter(@NonNull Context context, int resource, List<Contacts> list) {
        super(context, resource, list);
        this.resource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView != null) return convertView;
        Contacts contacts = getItem(position);
        @SuppressLint("ViewHolder") View view = LayoutInflater.from(getContext()).inflate(resource, parent, false);
        TextView nameText = view.findViewById(R.id.name);
        TextView phoneText = view.findViewById(R.id.phone);
        nameText.setText(contacts.getName());
        phoneText.setText(contacts.getPhone());
        return view;
    }

}
