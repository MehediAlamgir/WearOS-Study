/*
Topic:
Intent and Data passing with Intent
 */

package com.example.hellointent;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SecondActivity extends WearableActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");

        Toast.makeText(getApplicationContext(), "Values are:\n First Value: "+ value1+"\n Second Value: "+ value2, Toast.LENGTH_LONG).show();

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
