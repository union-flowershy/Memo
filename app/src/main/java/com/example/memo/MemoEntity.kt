package com.example.memo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Memo")
data class MemoEntity(

        @PrimaryKey(autoGenerate = true)
        var id: Long?,
        var memo: String = ""
        )