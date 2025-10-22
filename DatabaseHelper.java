package com.example.proiectfinal;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "student3.db";
    public static final String TABLE_NAME = "logare_table2";
    public static final String COL_ID = "ID";
    public static final String COL_USERANE = "Username";
    public static final String COL_PASSWORD = "Password";
    public static final String COL_EMAIL = "Email";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME
                + " (" + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL_USERANE + " TEXT, "
                + COL_EMAIL + " TEXT, "
                + COL_PASSWORD + " TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public boolean insertData(String Username, String Password,String Email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_USERANE, Username);
        values.put(COL_EMAIL, Email);
        values.put(COL_PASSWORD, Password);
        long result = db.insert(TABLE_NAME, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }
    public Cursor getAllData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "Select * from " + TABLE_NAME;
        Cursor result = db.rawQuery(query,null);
        return result;
    }

    public boolean Verificare(String Username, String Password) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "Select * from " + TABLE_NAME + " where Username ='" + Username + "' and Password ='" + Password + "'";
        Cursor result = db.rawQuery(query, null);
        if (result.getCount()==0) {
            return false;
        } else {
            return true;
        }
    }
    public String getemail(String Username,String Password){
        String s;
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "Select Email from " + TABLE_NAME + " where Username ='" + Username + "' and Password ='" + Password + "'";
        Cursor result = db.rawQuery(query, null);
        result.moveToFirst();
        s=result.getString(0);
        return s;
    }
}
