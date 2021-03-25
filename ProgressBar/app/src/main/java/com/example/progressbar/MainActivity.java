package com.example.progressbar;

import android.os.Bundle;
import android.os.Handler;
import android.support.wearable.activity.WearableActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView mTextView;
    private ProgressBar progressBar;
    private int progressValue = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.progress_value_tv);
        progressBar = (ProgressBar) findViewById(R.id.horizontal_pb);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(progressValue < 100)
                {
                    progressValue += 1;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progressValue);
                            mTextView.setText(progressValue + "/" + progressBar.getMax());
                        }
                    });
                    try
                    {
                        Thread.sleep(200);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();

        // Enables Always-on
        setAmbientEnabled();
    }
}