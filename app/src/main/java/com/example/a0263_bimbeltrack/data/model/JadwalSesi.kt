package com.example.a0263_bimbeltrack.data.model

/**
 * Entitas 3: JadwalSesi
 * Menyimpan data transaksi pemesanan jadwal bimbingan belajar antara Siswa dan Tentor.
 */
data class JadwalSesi(
    val id: Int = 0,
    val programId: Int,
    val tentorId: Int,
    val siswaId: Int,
    val tanggal: String,
    val jamMulai: String,
    val jamSelesai: String,
    val metodeBelajar: String, // "Tatap Muka" atau "Online Zoom"
    val statusSesi: String     // "Terjadwal", "Selesai", "Dibatalkan"
)
