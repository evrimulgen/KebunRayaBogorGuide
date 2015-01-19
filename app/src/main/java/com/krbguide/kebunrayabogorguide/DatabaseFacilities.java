package com.krbguide.kebunrayabogorguide;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseFacilities extends SQLiteOpenHelper {

    final static String DB_NAME = "detail_facilities";

    public DatabaseFacilities(Context mContext) {

        super(mContext, DB_NAME, null, 1);

    }

    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE IF NOT EXISTS detail_facilities(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "db_name TEXT, db_category TEXT, db_coordinate TEXT, db_ico BLOB)";
        db.execSQL(sql);
        ContentValues mValues = new ContentValues();

        mValues.put("_id", "1");
        mValues.put("db_ico", R.drawable.ic_facilities_gates);
        mValues.put("db_name", "Pintu Masuk 1");
        mValues.put("db_category", "Dekat Jl.Otto Iskandardinata");
        mValues.put("db_coordinate", "-6.60293, 106.7989");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "2");
        mValues.put("db_ico", R.drawable.ic_facilities_gates);
        mValues.put("db_name", "Pintu Masuk 2");
        mValues.put("db_category", "Dekat Jl.Ir.H.Djuanda");
        mValues.put("db_coordinate", "-6.59969, 106.7947");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "3");
        mValues.put("db_ico", R.drawable.ic_facilities_gates);
        mValues.put("db_name", "Pintu Masuk 3");
        mValues.put("db_category", "Dekat Jl.Jalak Harupat");
        mValues.put("db_coordinate", "-6.5955, 106.80394");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "4");
        mValues.put("db_ico", R.drawable.ic_facilities_gates);
        mValues.put("db_name", "Pintu Masuk 4");
        mValues.put("db_category", "Dekat Jl.Rumah Sakit");
        mValues.put("db_coordinate", "-6.59977, 106.80459");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "5");
        mValues.put("db_ico", R.drawable.ic_facilities_toilet);
        mValues.put("db_name", "Toilet");
        mValues.put("db_category", "Dekat Wisma Tamu Nusa Indah");
        mValues.put("db_coordinate", "-6.60257, 106.79586");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "6");
        mValues.put("db_ico", R.drawable.ic_facilities_toilet);
        mValues.put("db_name", "Toilet");
        mValues.put("db_category", "Dekat Pembibitan");
        mValues.put("db_coordinate", "-6.60134, 106.79734");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "7");
        mValues.put("db_ico", R.drawable.ic_facilities_toilet);
        mValues.put("db_name", "Toilet");
        mValues.put("db_category", "Dekat Museum Zoologi Bogor");
        mValues.put("db_coordinate", "-6.60359, 106.79679");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "8");
        mValues.put("db_ico", R.drawable.ic_facilities_toilet);
        mValues.put("db_name", "Toilet");
        mValues.put("db_category", "Dekat Makam Belanda");
        mValues.put("db_coordinate", "-6.60031, 106.7959");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "9");
        mValues.put("db_ico", R.drawable.ic_facilities_toilet);
        mValues.put("db_name", "Toilet");
        mValues.put("db_category", "Dekat Taman Koleksi Tumbuhan Air");
        mValues.put("db_coordinate", "-6.60042, 106.80077");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "10");
        mValues.put("db_ico", R.drawable.ic_facilities_toilet);
        mValues.put("db_name", "Toilet");
        mValues.put("db_category", "Dekat Area Kelapa Sawit");
        mValues.put("db_coordinate", "-6.5983, 106.79993");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "11");
        mValues.put("db_ico", R.drawable.ic_facilities_toilet);
        mValues.put("db_name", "Toilet");
        mValues.put("db_category", "Dekat Rumah Anggrek");
        mValues.put("db_coordinate", "-6.59503, 106.80278");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "12");
        mValues.put("db_ico", R.drawable.ic_facilities_toilet);
        mValues.put("db_name", "Toilet");
        mValues.put("db_category", "Dekat Kolam Teratai Raksasa");
        mValues.put("db_coordinate", "-6.59808, 106.80248");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "13");
        mValues.put("db_ico", R.drawable.ic_facilities_toilet);
        mValues.put("db_name", "Toilet");
        mValues.put("db_category", "Dekat Pintu Masuk 4");
        mValues.put("db_coordinate", "-6.59936, 106.80467");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "14");
        mValues.put("db_ico", R.drawable.ic_facilities_cafe);
        mValues.put("db_name", "Kantin DWP");
        mValues.put("db_category", "Dekat Pintu Masuk 1");
        mValues.put("db_coordinate", "-6.60242, 106.79861");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "15");
        mValues.put("db_ico", R.drawable.ic_facilities_cafe);
        mValues.put("db_name", "Kantin Museum Zoologi Bogor");
        mValues.put("db_category", "Dekat Museum Zoologi Bogor");
        mValues.put("db_coordinate", "-6.6033, 106.79695");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "16");
        mValues.put("db_ico", R.drawable.ic_facilities_cafe);
        mValues.put("db_name", "Cafe Dedaunan");
        mValues.put("db_category", "Dekat Kolam Teratai Raksasa");
        mValues.put("db_coordinate", "-6.59871, 106.8035");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "17");
        mValues.put("db_ico", R.drawable.ic_facilities_mosque);
        mValues.put("db_name", "Musholla");
        mValues.put("db_category", "Dekat Wisma Nusa Indah");
        mValues.put("db_coordinate", "-6.60257, 106.79578");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "18");
        mValues.put("db_ico", R.drawable.ic_facilities_mosque);
        mValues.put("db_name", "Musholla");
        mValues.put("db_category", "Dekat Museum Zoologi Bogor");
        mValues.put("db_coordinate", "-6.60370, 106.79679");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "19");
        mValues.put("db_ico", R.drawable.ic_facilities_mosque);
        mValues.put("db_name", "Musholla");
        mValues.put("db_category", "Dekat Pintu Masuk 4");
        mValues.put("db_coordinate", "-6.59936, 106.80467");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "20");
        mValues.put("db_ico", R.drawable.ic_facilities_mosque);
        mValues.put("db_name", "Musholla");
        mValues.put("db_category", "Dekat Kolam Teratai Raksasa");
        mValues.put("db_coordinate", "-6.59811, 106.80231");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "21");
        mValues.put("db_ico", R.drawable.ic_facilities_wisma);
        mValues.put("db_name", "Wisma Tamu Nusa Indah");
        mValues.put("db_category", "Dekat Lab. Treub");
        mValues.put("db_coordinate", "-6.60238, 106.79644");
        db.insert("detail_facilities", "_id", mValues);

        mValues.put("_id", "22");
        mValues.put("db_ico", R.drawable.ic_facilities_wisma);
        mValues.put("db_name", "Wisma Pinus");
        mValues.put("db_category", "Dekat Pintu Masuk 3");
        mValues.put("db_coordinate", "-6.59688, 106.80371");
        db.insert("detail_facilities", "_id", mValues);

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS detail_facilities");
        onCreate(db);

    }

}
