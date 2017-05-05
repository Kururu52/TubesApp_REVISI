package com.example.bagushernanda.tubesapp;

/**
 * Created by Bagus Hernanda on 4/28/2017.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "dbwisata";
    public static final String NAMA = "nama";
    public static final String KEY_ID = "_id";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    // method createTable untuk membuat table WISATA
    public void createTable(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS WISATA");
        db.execSQL("CREATE TABLE if not exists WISATA (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "nama TEXT);");
    }

    // method generateData untuk mengisikan data ke table Wisata.
    public void generateData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(NAMA, "Sariater");
        db.insert("WISATA", NAMA, cv);
        cv.put(NAMA, "Tangkuban Perahu");
        db.insert("WISATA", NAMA, cv);
        cv.put(NAMA, "Kawah Putih");
        db.insert("WISATA", NAMA, cv);
        cv.put(NAMA, "Kampung Gajah");
        db.insert("WISATA", NAMA, cv);
        cv.put(NAMA, "Trans Studio");
        db.insert("WISATA", NAMA, cv);

    }

    // method delAllAdata untuk menghapus data di table Wisata.
    public void delAllData(SQLiteDatabase db) {
        db.delete("WISATA", null, null);
    }

    public Cursor fetchAllWisata(SQLiteDatabase db) {
        return db.query("WISATA", new String[] { KEY_ID, NAMA }, null, null,
                null, null, null);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        createTable(db);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub

    }
}