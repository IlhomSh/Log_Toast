package com.example.log_toast;

import android.content.Context;
import android.widget.Toast;

public class LogToast {

    public static void toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
