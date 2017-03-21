package com.a2j.ssetultimerough;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.json.JSONException;
import org.json.JSONObject;

public class create_account extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        final EditText name1 = (EditText) findViewById(R.id.name1);
        final EditText mob1 = (EditText) findViewById(R.id.mob1);
        final EditText name2 = (EditText) findViewById(R.id.name2);
        final EditText pswd = (EditText) findViewById(R.id.pswd);
        final Button bregister = (Button) findViewById(R.id.bregister);
        Toast t6 = Toast.makeText(create_account.this, "inside ", Toast.LENGTH_SHORT);
        t6.show();

        bregister.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Toast t9 = Toast.makeText(create_account.this, "inside click", Toast.LENGTH_SHORT);
                t9.show();

                final String name = name1.getText().toString();
                final int mobile = Integer.parseInt(mob1.getText().toString());
                final String username = name2.getText().toString();
                final String password = pswd.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {

                            Toast t1 = Toast.makeText(create_account.this, "inside try", Toast.LENGTH_SHORT);
                            t1.show();
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success) {
                                Toast t2 = Toast.makeText(create_account.this, "inside success", Toast.LENGTH_SHORT);
                                t2.show();
                                Intent intent = new Intent(create_account.this, SIGNUP.class);
                                create_account.this.startActivity(intent);
                            } else {
                                Toast t2 = Toast.makeText(create_account.this, "inside else", Toast.LENGTH_SHORT);
                                t2.show();
                                AlertDialog.Builder builder = new AlertDialog.Builder(create_account.this);
                                builder.setMessage("Register failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }

                };


                RegisterRequest registerRequest = new RegisterRequest(name, username, password, mobile, responseListener);
                RequestQueue queue = Volley.newRequestQueue(create_account.this);
                queue.add(registerRequest);
            }


        });



    }
}





