package com.example.introbroascastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class ConnectionReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("BR", ""+intent.getAction());

        if (intent.getAction().equals("com.example.introbroascastreceiver.SOME_ACTON"))
        {
            Toast.makeText(context, "SOME_ACTION is received", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(context,"Failure!! Broadcast is not received.", Toast.LENGTH_LONG).show();
        }
    }
}
