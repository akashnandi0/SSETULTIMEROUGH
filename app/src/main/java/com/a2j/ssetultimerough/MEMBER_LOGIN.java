package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MEMBER_LOGIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member__login);
    }
    public void lOUT(View view) {
        Intent SSETWORLD = new Intent(MEMBER_LOGIN.this, SSETWORLD.class);
        startActivity(SSETWORLD);
    }
    public void ePAY(View view) {
        Intent EPAYMENT = new Intent(MEMBER_LOGIN.this, EPAYMENT.class);
        startActivity(EPAYMENT);
    }
    public void lB(View view) {
        Intent LIBRARY = new Intent(MEMBER_LOGIN.this, LIBRARY.class);
        startActivity(LIBRARY);
    }
    public void eV(View view) {
        Intent EVENTS = new Intent(MEMBER_LOGIN.this, EVENTS.class);
        startActivity(EVENTS);
    }
}
