package com.example.contacts_a2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // hooks
    ListView lvContacts;

    ArrayList<Contact> contacts;
    ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lvContacts = findViewById(R.id.lvContacts);
        contacts = new ArrayList<>();
        // public Contact(String name, String phone, String email, String address, String url) {
        //
        contacts.add(new Contact("Arif", "03234677413", "arif@gmail.com", "umt lahore", "https://www.umt.edu.pk"));
        contacts.add(new Contact("Raja Azhar", "03233365211", "raja.azhar@gmail.com", "fast lahore", "https://www.fast.nu.pk"));
        contacts.add(new Contact("Rameesha", "03234954632", "rameesha@gmail.com", "pucit lahore", "https://www.pucit.edu.pk"));
contacts.add(new Contact("Arif", "03234677413", "arif@gmail.com", "umt lahore", "https://www.umt.edu.pk"));
        contacts.add(new Contact("Raja Azhar", "03233365211", "raja.azhar@gmail.com", "fast lahore", "https://www.fast.nu.pk"));
        contacts.add(new Contact("Rameesha", "03234954632", "rameesha@gmail.com", "pucit lahore", "https://www.pucit.edu.pk"));
contacts.add(new Contact("Arif", "03234677413", "arif@gmail.com", "umt lahore", "https://www.umt.edu.pk"));
        contacts.add(new Contact("Raja Azhar", "03233365211", "raja.azhar@gmail.com", "fast lahore", "https://www.fast.nu.pk"));
        contacts.add(new Contact("Rameesha", "03234954632", "rameesha@gmail.com", "pucit lahore", "https://www.pucit.edu.pk"));
contacts.add(new Contact("Arif", "03234677413", "arif@gmail.com", "umt lahore", "https://www.umt.edu.pk"));
        contacts.add(new Contact("Raja Azhar", "03233365211", "raja.azhar@gmail.com", "fast lahore", "https://www.fast.nu.pk"));
        contacts.add(new Contact("Rameesha", "03234954632", "rameesha@gmail.com", "pucit lahore", "https://www.pucit.edu.pk"));

        adapter = new ContactAdapter(this, contacts);
        lvContacts.setAdapter(adapter);

    }
}