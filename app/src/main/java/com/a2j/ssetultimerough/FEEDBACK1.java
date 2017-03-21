package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FEEDBACK1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback1);
    }
    public void exit(View view) {
        Intent MEMBER_LOGIN = new Intent(FEEDBACK1.this, MEMBER_LOGIN.class);
        startActivity(MEMBER_LOGIN);
    }
}
