package com.example.alertdialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.alertdialog.R;

public class ViewDialog extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button yes, no;

    public ViewDialog(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_alert_dialog);
        yes = (Button) findViewById(R.id.btn_ok);
        no = (Button) findViewById(R.id.btn_cancel);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ok:
                c.finish();
                break;
            case R.id.btn_cancel:
                dismiss();
                break;
            default:
                break;
        }
    }
}