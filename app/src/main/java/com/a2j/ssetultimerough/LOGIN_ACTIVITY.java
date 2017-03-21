package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LOGIN_ACTIVITY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__activity);

        final EditText name2 = (EditText) findViewById(R.id.name2);
        final EditText pswd = (EditText) findViewById(R.id.pswd);
        final Button blogin = (Button) findViewById(R.id.blogin);
        final TextView registerlink = (TextView) findViewById(R.id.registerlink);

        registerlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LOGIN_ACTIVITY.this,RegisterRequest.class);
                LOGIN_ACTIVITY.this.startActivity(registerIntent);
            }
        });
    }
    public void mLOGIN(View view) {
        Intent MEMBER_LOGIN = new Intent(LOGIN_ACTIVITY.this, MEMBER_LOGIN.class);
        startActivity(MEMBER_LOGIN);
    }
    public void fP(View view) {
        Intent Forgotpassword = new Intent(LOGIN_ACTIVITY.this, Forgotpassword.class);
        startActivity(Forgotpassword);
    }
    public void sGUP(View view) {
        Intent create_account = new Intent(LOGIN_ACTIVITY.this, create_account.class);
        startActivity(create_account);
    }
}
