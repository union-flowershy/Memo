package com.example.memo

//import androidx.room.Dao
//import androidx.room.Delete
//import androidx.room.Insert
//import androidx.room.OnConflictStrategy.REPLACE
//import androidx.room.Query


//@Dao
//interface MemoDAO {
//
//    //@Insert(onConflict = REPLACE)   // insert 진행시 primaryKey가 중복시 1번 / 나중에 insert진행시 또 1번이 나오면 중복된다
//    @Insert(onConflict = REPLACE)
//    //fun insert(memo : MemoEntity)
//
//    @Query("SELECT * FROM memo")
//    //fun getAll() : List<MemoEntity>
//
//    @Delete
//    //fun delete(memo : MemoEntity)
//}