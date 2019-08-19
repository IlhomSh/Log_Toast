package com.example.log_toast;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

 class LogToast extends Logs {

    public void toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }


    public void newIntent(Context context) {
        Intent intent = new Intent(context, Library_Actvity.class);
        context.startActivity(intent);
    }
}
