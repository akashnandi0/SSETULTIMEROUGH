package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OTP2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp2);
    }
    public void prf(View view) {
        Intent MEMBER_LOGIN = new Intent(OTP2.this, MEMBER_LOGIN.class);
        startActivity(MEMBER_LOGIN);


    }
}
