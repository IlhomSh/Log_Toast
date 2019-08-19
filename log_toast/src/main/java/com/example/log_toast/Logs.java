package com.example.log_toast;

import android.content.Context;

public abstract class Logs {

    public static void init() {
        new LogToast();
    }

    public abstract void toast(Context context, String message);

    public abstract void newIntent(Context context);
}
