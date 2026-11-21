package com.example.a0263_bimbeltrack.data.model

/**
 * Entitas 2: ProfilTentor
 * Menyimpan data pengajar/tentor yang mengampu sesi bimbingan.
 */
data class ProfilTentor(
    val id: Int = 0,
    val namaLengkap: String,
    val gelarAkademik: String,
    val keahlianMapel: String,
    val rating: Float = 5.0f,
    val kontakTelepon: String
)
