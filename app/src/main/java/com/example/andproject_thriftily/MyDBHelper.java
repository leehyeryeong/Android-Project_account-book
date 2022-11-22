package com.example.andproject_thriftily;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDBHelper extends SQLiteOpenHelper {
    public MyDBHelper(@Nullable Context context) {
        super(context, "accountDB.db", null, 1);
        //데이터베이스 이름 accountDB
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //테이블 생성
        //필요한 속성... 입금/지출/날짜???/사용자가누군지/가격
        String str = "create table accountTBL(getMoney getchar(50), outMoney getchar(50), );";
        sqLiteDatabase.execSQL(str);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //sqLiteDatabase.execSQL("delete from accountTBL;");
        sqLiteDatabase.execSQL("drop table if exists accountTBL;"); //테이블 삭제
        onCreate(sqLiteDatabase); //테이블 생성
    }
}