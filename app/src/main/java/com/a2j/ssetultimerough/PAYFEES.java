package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PAYFEES extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payfees);
    }
    public void hF(View view) {
        Intent AMOUNT = new Intent(PAYFEES.this, AMOUNT.class);
        startActivity(AMOUNT);
    }
    public void mF(View view) {
        Intent AMOUNT = new Intent(PAYFEES.this, AMOUNT.class);
        startActivity(AMOUNT);
    }
    public void lF(View view) {
        Intent AMOUNT = new Intent(PAYFEES.this, AMOUNT.class);
        startActivity(AMOUNT);
    }
    public void tRF(View view) {
        Intent AMOUNT = new Intent(PAYFEES.this, AMOUNT.class);
        startActivity(AMOUNT);
    }
    public void tF(View view) {
        Intent AMOUNT = new Intent(PAYFEES.this, AMOUNT.class);
        startActivity(AMOUNT);
    }
}
