package com.example.a0263_bimbeltrack.data.model

/**
 * Entitas 1: ProgramBimbel
 * Menyimpan data katalog program/mata pelajaran bimbingan belajar.
 */
data class ProgramBimbel(
    val id: Int = 0,
    val namaProgram: String,
    val kategoriMapel: String,
    val jenjangPendidikan: String,
    val deskripsi: String,
    val jumlahSesi: Int,
    val biaya: Double
)
