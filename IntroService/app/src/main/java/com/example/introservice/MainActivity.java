package com.example.introservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView mTextView;
    Button playBtn,stopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);
        playBtn = findViewById(R.id.play_btn);
        stopBtn = findViewById(R.id.stop_btn);

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playMusic = new Intent(MainActivity.this, MyService.class);
                startService(playMusic);
            }
        });

        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stopMusic = new Intent(MainActivity.this, MyService.class);
                stopService(stopMusic);
            }
        });

        // Enables Always-on
        setAmbientEnabled();
    }
}
