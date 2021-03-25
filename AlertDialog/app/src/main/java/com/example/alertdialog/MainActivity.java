package com.example.alertdialog;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends WearableActivity {
    Button clickBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickBtn = (Button)findViewById(R.id.clickBtn);
        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(),"Button Clicked", Toast.LENGTH_SHORT).show();

                ViewDialog vd = new ViewDialog(MainActivity.this);
                vd.show();
            }
        });
    }
}
