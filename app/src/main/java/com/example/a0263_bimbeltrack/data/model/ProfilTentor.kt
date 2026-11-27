package com.example.a0263_bimbeltrack.data.model

/**
 * Entitas 2: ProfilTentor
 * Menyimpan informasi keahlian akademik dan jadwal ketersediaan mengajar seorang Tentor.
 */
data class ProfilTentor(
    val id: Int = 0,
    val userId: Int,
    val namaLengkap: String = "",
    val gelarAkademik: String,
    val keahlianMapel: String,
    val jadwalKetersediaan: String,
    val kontakTelepon: String
)