package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NETBANKING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netbanking);
    }
    public void log(View view) {
        Intent OTP = new Intent(NETBANKING.this, OTP.class);
        startActivity(OTP);


    }
    public void cncl(View view) {
        Intent MODE = new Intent(NETBANKING.this, MODE.class);
        startActivity(MODE);


    }
}
