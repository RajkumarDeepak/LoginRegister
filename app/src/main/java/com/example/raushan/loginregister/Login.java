package com.example.raushan.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener{


    Button Login;

    EditText etPassword, etUsername;

    TextView tvRegisterHere;


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Login:
                break;


            case R.id.tvRegisterHere:

                startActivity(new Intent(this,Register.Class));
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etPassword=(EditText) findViewById(R.id.etPassword);
        etUsername=(EditText) findViewById(R.id.etUsername);
        tvRegisterHere=(TextView)findViewById(R.id.tvRegisterHere);
        Login=(Button) findViewById(R.id.Login);

       Login.setOnClickListener(this);

        tvRegisterHere.setOnClickListener(this);



    }
}
