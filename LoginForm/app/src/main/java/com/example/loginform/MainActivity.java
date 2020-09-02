/*
Topic:
1. Created a login form
2. Used custom style
 */

package com.example.loginform;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;


public class MainActivity extends WearableActivity {

    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       username = findViewById(R.id.username);
       password = findViewById(R.id.password);
       login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String un = username.getText().toString();
                String pwd = password.getText().toString();
                Log.d("Uinfo", "User Name: "+ un);
               Log.d("Uinfo", "Password: "+ pwd);

                if (Objects.equals(un,"mehedi") && Objects.equals(pwd,"33"))
                {
                    Toast.makeText(MainActivity.this, "Successfully logged in", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Wrong User name or Password", Toast.LENGTH_LONG).show();
                }
            }
        });

        // Enables Always-on
        //setAmbientEnabled();
    }
}
