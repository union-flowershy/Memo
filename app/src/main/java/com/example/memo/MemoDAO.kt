package com.example.memo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE


@Dao
interface MemoDAO {

    //@Insert(onConflict = REPLACE)   // insert 진행시 primaryKey가 중복시 1번 / 나중에 insert진행시 또 1번이 나오면 중복된다

}