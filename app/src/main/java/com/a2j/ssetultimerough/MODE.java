package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MODE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);


        Spinner spinner_dialouge = (Spinner) findViewById(R.id.spinner_dialouge);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.payment_mode, android.R.layout.simple_spinner_item);
    // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    // Apply the adapter to the spinner
        spinner_dialouge.setAdapter(adapter);


        Spinner spinner_dropdown = (Spinner) findViewById(R.id.spinner_dropdown);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.bank, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner_dropdown.setAdapter(adapter1);


    }
    public void bank(View view) {
        Intent NETBANKING = new Intent(MODE.this, NETBANKING.class);
        startActivity(NETBANKING);
    }
}
