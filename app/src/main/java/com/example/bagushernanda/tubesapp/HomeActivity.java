package com.example.bagushernanda.tubesapp;

/**
 * Created by Bagus Hernanda on 4/21/2017.
 */

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.example.bagushernanda.tubesapp.R;

public class HomeActivity  extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dasboard);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }


        //inisialisai tombol pada dasboard
        Button btncafe = (Button) findViewById(R.id.btnCafe);
        Button btnwisata = (Button) findViewById(R.id.btnWisata);
        Button btnmaps = (Button) findViewById(R.id.btnMaps);
        Button btnfeedback = (Button) findViewById(R.id.btnFeedback);
        Button btnshare = (Button) findViewById(R.id.btnSetting);
        Button btnabout = (Button) findViewById(R.id.btnAbout);

        //start aksi tombol



        btncafe.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(HomeActivity.this, CafeBars.class));
            }
        });

        btnwisata.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ListViewSQliteActivity.class));
            }});
        btnmaps.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
               startActivity(new Intent(HomeActivity.this, Maps.class));
            }
        });

        btnabout.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, About.class));
            }});
        btnfeedback.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Feedback.class));
            }});

        btnshare.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Tombol Share",Toast.LENGTH_SHORT).show();
                Intent sharingIntent;
                sharingIntent =   new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,   "Download Aplikasi Travel Apps");
                String shareMessage = "Klik Link Untuk Download Aplikasi \n http://www.google.com";
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT,   shareMessage);
                startActivity(Intent.createChooser(sharingIntent,   "Share Via"));
            }});
    }


}
