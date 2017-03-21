package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AMOUNT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount);
    }
    public void proceed(View view) {
        Intent MODE = new Intent(AMOUNT.this, MODE.class);
        startActivity(MODE);
    }
}
