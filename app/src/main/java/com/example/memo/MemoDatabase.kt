package com.example.memo

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities= arrayOf(MemoEntity::class), version = 1)
abstract class MemoDatabase : RoomDatabase() {

    abstract fun memoDAO() : MemoDAO

    companion object {
        var INSTANT : MemoDatabase? = null

        fun getInstance(context : Context) : MemoDatabase? {
            if(INSTANT == null) {
                synchronized(MemoDatabase::class) {
                    INSTANT = Room.databaseBuilder(context.applicationContext,
                    MemoDatabase::class.java, "memo.db")
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }

            return INSTANT

        }

    }
}