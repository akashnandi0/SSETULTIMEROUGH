package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class changepassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepassword);
    }
    public void ctp(View view) {
        Intent LOGIN_ACTIVITY = new Intent(changepassword.this, LOGIN_ACTIVITY.class);
        startActivity(LOGIN_ACTIVITY);
    }
}
