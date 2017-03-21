package com.a2j.ssetultimerough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LIBRARY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
    }
    public void bs(View view) {
        Intent BOOKSEARCH = new Intent(LIBRARY.this, BOOKSEARCH.class);
        startActivity(BOOKSEARCH);

    }
    public void fB(View view) {
        Intent FEEDBACK = new Intent(LIBRARY.this, FEEDBACK.class);
        startActivity(FEEDBACK);
    }

}
