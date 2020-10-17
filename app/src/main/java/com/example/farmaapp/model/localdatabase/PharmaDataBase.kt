package com.example.farmaapp.model.localdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [PharmaEntity::class], version = 1)
abstract class PharmaDataBase: RoomDatabase() {
    abstract fun getPharmaDao() : PharmaDao
    companion object{

        @Volatile
        private var INSTANCE: PharmaDataBase? = null

        fun getDataBase(context: Context): PharmaDataBase{
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(context,
                PharmaDataBase::class.java,
                "drugStoreDatabase")
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}