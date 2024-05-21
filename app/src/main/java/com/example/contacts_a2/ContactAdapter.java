package com.example.contacts_a2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.helper.widget.Layer;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {

    public ContactAdapter(@NonNull Context context, @NonNull List<Contact> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if(v == null)
        {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.single_contact_design, parent, false);
        }

        Contact c = getItem(position);
        TextView tvName, tvNumber;
        ImageView ivCall;

        tvName = v.findViewById(R.id.tvName);
        tvNumber = v.findViewById(R.id.tvNumber);
        ivCall = v.findViewById(R.id.ivCall);

        assert c != null;
        tvNumber.setText(c.getPhone());
        tvName.setText(c.getName());

        ivCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+c.getPhone()));
                parent.getContext().startActivity(i);
            }
        });

        return v;
    }
}
