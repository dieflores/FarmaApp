package com.example.farmaapp.model.localdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "drug_store")
data class PharmaEntity(
    val comunaNombre: String,
    val funcionamientoDia: String,
    val funcionamientoHoraApertura: String,
    val funcionamientoHoraCierre: String,
    val localDireccion: String,
    @PrimaryKey val localId: String,
    val localNombre: String,
    val localTelefono: String,
    val localidadNombre: String
)