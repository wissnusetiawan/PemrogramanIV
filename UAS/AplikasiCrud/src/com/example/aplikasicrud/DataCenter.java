package com.example.aplikasicrud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataCenter extends SQLiteOpenHelper {
	
	private static final String DATABASE_NAME = "crud.db";
	private static final int DATABASE_VERSION = 1;
	public DataCenter(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String sql = "create table biodata(npm integer primary key, nama text null, tgl text null, jk text null, alamat text null);";
		Log.d("Data", "onCreate: " + sql);
		db.execSQL(sql);
		sql = "INSERT INTO biodata (npm, nama, tgl, jk, alamat) VALUES ('1255', 'Fadlan', '1992-10-11', 'Laki-laki','Mranggen');";
		db.execSQL(sql);
		sql = "INSERT INTO biodata (npm, nama, tgl, jk, alamat) VALUES ('1156', 'Dadi Susanto', '1994-06-14', 'Laki-laki','Pucang Gading');";
		db.execSQL(sql);
		sql = "INSERT INTO biodata (npm, nama, tgl, jk, alamat) VALUES ('1357', 'Sholikhul Hadi', '1992-07-04', 'Laki-laki','Mranggen');";
		db.execSQL(sql);
		sql = "INSERT INTO biodata (npm, nama, tgl, jk, alamat) VALUES ('1456', 'Atik', '1992-06-14', 'Perempuan','Semarang');";
		db.execSQL(sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
