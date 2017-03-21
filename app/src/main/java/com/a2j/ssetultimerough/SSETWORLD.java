package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SSETWORLD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssetworld);
    }

    public void sU(View view) {
        Intent LOGIN_ACTIVITY = new Intent(SSETWORLD.this, LOGIN_ACTIVITY.class);
        startActivity(LOGIN_ACTIVITY);
    }

    public void sUU(View view) {
        Intent create_account = new Intent(SSETWORLD.this, create_account.class);
        startActivity(create_account);

    }

    public void wB(View view) {
        Intent WEBSITE = new Intent(SSETWORLD.this, WEBSITE.class);
        startActivity(WEBSITE);

    }

}
