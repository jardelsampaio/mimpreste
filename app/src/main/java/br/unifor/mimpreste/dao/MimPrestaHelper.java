package br.unifor.mimpreste.dao;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by bruno on 04/05/2016.
 */
public class MimPrestaHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "mimpresta.db";
    private static final int DATABASE_VERSION = 1;
    private Context mContext;

    public MimPrestaHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try {

            AssetManager assetManager = mContext.getAssets();
            InputStream in = assetManager.open("/db/create_database.sql");
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            String line = null;
            while((line = reader.readLine()) != null){
                db.execSQL(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        try {

            AssetManager assetManager = mContext.getAssets();
            InputStream in = assetManager.open("/db/update_database.sql");
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            String line = null;
            while((line = reader.readLine()) != null){
                db.execSQL(line);
            }

            onCreate(db);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
