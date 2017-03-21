package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OTP1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp1);
    }
    public void sotp(View view) {
        Intent OTP2 = new Intent(OTP1.this, OTP2.class);
        startActivity(OTP2);


    }
}
