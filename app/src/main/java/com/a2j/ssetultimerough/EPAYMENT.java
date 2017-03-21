package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EPAYMENT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epayment);
    }
    public void pFEES(View view) {
        Intent PAYFEES = new Intent(EPAYMENT.this, PAYFEES.class);
        startActivity(PAYFEES);
    }
}
