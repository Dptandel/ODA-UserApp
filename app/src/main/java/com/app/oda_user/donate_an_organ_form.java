package com.app.oda_user;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class donate_an_organ_form extends AppCompatActivity {

    String[] items = {"Eyes","Kidneys (2)","One Kidney","Lungs (2)","One Lung","Liver","Heart","Pancreas","Intestines"};

    AutoCompleteTextView selectOrgan;
    ArrayAdapter<String> adapterItems;

    Button btnDonateSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_an_organ_form);

        selectOrgan = findViewById(R.id.select_organ);

        adapterItems = new ArrayAdapter<>(this, R.layout.list_item, items);

        selectOrgan.setAdapter(adapterItems);

        selectOrgan.setOnItemClickListener((parent, view, position, id) -> {
            String item = parent.getItemAtPosition(position).toString();
            Toast.makeText(getApplicationContext(), "Organ: "+item, Toast.LENGTH_SHORT).show();
        });

        btnDonateSubmit = findViewById(R.id.btnDonateSubmit);

        btnDonateSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}