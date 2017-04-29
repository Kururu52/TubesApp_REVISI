package com.example.bagushernanda.tubesapp;

/**
 * Created by Bagus Hernanda on 4/29/2017.
 */
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class StartScreen extends AppCompatActivity {
    public static final int NOTIFICATION_ID = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startscreen);


        //getSupportActionBar().setSubtitle("");

    }

    public void tampilNotification(View view) {
        Intent intent = new Intent(StartScreen.this, HomeActivity.class);
        startActivity(intent);
/*
Menmbangun atau mensetup Notification dengan NotificationCompat.Builder
 */
        NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher) //ikon notification
                .setContentTitle("NOTIFICATION") //judul konten
                .setAutoCancel(true)//untuk menswipe atau menghapus notification
                .setContentText("Selamat Datang di Aplikasi Eat and GO"); //isi text

/*
Kemudian kita harus menambahkan Notification dengan menggunakan NotificationManager
 */

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(NOTIFICATION_ID, builder.build()
        );


    }



}

