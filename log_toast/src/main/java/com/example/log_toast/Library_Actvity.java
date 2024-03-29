package com.example.log_toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

class Library_Actvity extends AppCompatActivity {

    private Button button1, button2;

    Logs logs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library__actvity);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        logs = new LogToast();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logs.toast(getBaseContext(), "SAVE");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logs.toast(getBaseContext(), "DELETE");
            }
        });
    }
}
