package com.example.bn000976322.timeout;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    Thread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1500);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent i = new Intent(SplashScreen.this,ParentActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };

        thread.start();
    }





}
