package com.example.log_toast;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

final class LogToast extends Logs {

    public Logs toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        return this;
    }


    public Logs newIntent(Context context) {
        Intent intent = new Intent(context, Library_Actvity.class);
        context.startActivity(intent);
        return this;
    }
}
