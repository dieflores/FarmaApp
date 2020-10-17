package com.example.farmaapp.model.localdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PharmaDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllPharma(list: List<PharmaEntity>)

    @Query("SELECT * FROM drug_store")
    fun getAllPharma(): LiveData<List<PharmaEntity>>
}