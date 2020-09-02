/*
Topic:
Intent and Data passing with Intent
 */

package com.example.hellointent;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView mTextView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                i.putExtra("Value1", "Wear OS");
                i.putExtra("Value2", "Data Pssing Thorough Intent");
                startActivity(i);
            }
        });

        // Enables Always-on
        setAmbientEnabled();
    }
}
