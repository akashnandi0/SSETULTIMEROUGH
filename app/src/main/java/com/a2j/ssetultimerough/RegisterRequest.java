package com.a2j.ssetultimerough;

import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String Register_Request_URL="https://a2j.000webhostapp.com/Register.php";
    private Map<String,String> params;


    public RegisterRequest(String name,String username,String password,int mobile,Response.Listener<String> listener){

        super(Method.POST,Register_Request_URL,listener,null);
        params= new HashMap<>( );
        params.put("name",name);
        params.put("username",username);
        params.put("password",password);
        params.put("mobile",mobile + "");


    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}