package br.unifor.mimpreste.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by bruno on 04/05/2016.
 */
public class MimPrestaHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "mimpresta.db";
    private static final int DATABASE_VERSION = 1;

    public MimPrestaHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
