package com.example.raushan.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    Button etLogout;

    EditText etName, etAge, etUsername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName =(EditText)findViewById(R.id.etName);
        etAge  =(EditText)findViewById(R.id.etAge);
        etUsername=(EditText)findViewById(R.id.etUsername);


        etLogout=(Button)findViewById(R.id.etLogout);

        etLogout.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){


            case R.id.etLogout:

            startActivity(new Intent(this,Register.Login.class));
            break;
        }

    }
}
