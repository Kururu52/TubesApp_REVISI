package com.example.bagushernanda.tubesapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import com.example.bagushernanda.tubesapp.HomeActivity;

public class MainActivity extends Activity {

    private static final int SPLASH_TIME = 5 * 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_splash_screen);

        ProgressBar prg = (ProgressBar)findViewById(R.id.progressBar1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,LoginForm.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME);
    }

}
