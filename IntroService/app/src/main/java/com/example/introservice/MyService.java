package com.example.introservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.MediaStore;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends Service {

    MediaPlayer mp;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d("mp_service", "onBind()");
        return null;
    }

    @Override
    public void onCreate() {
        Log.d("mp_service", "onCreate()");
        super.onCreate();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.hashimukh);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("mp_service", "onStartCommand()");
        mp.start();

        return Service.START_STICKY_COMPATIBILITY;
    }

    @Override
    public void onDestroy() {
        Log.d("mp_service", "onDestroy()");
        mp.release();
        super.onDestroy();
    }
}
