package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SIGNUP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


    }
    public void lG(View view) {
        Intent LOGIN_ACTIVITY = new Intent(SIGNUP.this, LOGIN_ACTIVITY.class);
        startActivity(LOGIN_ACTIVITY);
    }
}
