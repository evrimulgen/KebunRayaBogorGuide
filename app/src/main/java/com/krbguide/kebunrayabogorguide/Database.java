package com.krbguide.kebunrayabogorguide;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.krbguide.kebunrayabogorguide.MapsActivity;

public class Database extends SQLiteOpenHelper {

    final static String DB_NAME = "detail";

    public Database(Context mContext) {

        super(mContext, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub

    }

    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE IF NOT EXISTS detail(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "db_name TEXT, db_subname TEXT, db_description TEXT, db_coordinate TEXT, db_img BLOB)";
        db.execSQL(sql);
        ContentValues mValues = new ContentValues();

        mValues.put("_id", "1");
        mValues.put("db_img", R.drawable.ic_launcher);
        mValues.put("db_name", "Lorem ipsum");
        mValues.put("db_subname", "Lorem ipsum");
        mValues.put("db_description", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        mValues.put("db_coordinate", "-6.597629, 106.79957");
        db.insert("detail", "_id", mValues);

        mValues.put("_id", "2");
        mValues.put("db_img", R.drawable.ic_launcher);
        mValues.put("db_name", "Lorem ipsum");
        mValues.put("db_subname", "Lorem ipsum");
        mValues.put("db_description", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        mValues.put("db_coordinate", "-6.597629, 106.79957");
        db.insert("detail", "_id", mValues);

        mValues.put("_id", "3");
        mValues.put("db_img", R.drawable.ic_launcher);
        mValues.put("db_name", "Lorem ipsum");
        mValues.put("db_subname", "Lorem ipsum");
        mValues.put("db_description", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        mValues.put("db_coordinate", "-6.597629, 106.79957");
        db.insert("detail", "_id", mValues);

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS detail");
        onCreate(db);

    }

}
