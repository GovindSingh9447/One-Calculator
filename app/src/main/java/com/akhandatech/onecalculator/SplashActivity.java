package com.akhandatech.onecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);


        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread thread= new Thread() {
            public void run() {
                try {
                    sleep(2200);



                } catch (Exception e) {
                    e.printStackTrace();


                } finally {
                    Intent intent=new Intent( SplashActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();

                }

            }


        };thread.start();
    }
}