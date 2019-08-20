package com.example.log_toast;

import android.content.Context;
import android.util.Log;


public  abstract  class Logs {
    private static final Logs logs = new LogToast();

    public static Logs init() {
        return logs;
    }

    public abstract Logs toast(Context context, String message);

    public abstract Logs newIntent(Context context);
}
