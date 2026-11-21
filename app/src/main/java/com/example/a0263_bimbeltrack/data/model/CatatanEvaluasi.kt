package com.example.a0263_bimbeltrack.data.model

/**
 * Entitas 4: CatatanEvaluasi
 * Menyimpan data hasil presensi kehadiran dan evaluasi nilai kuis dari Tentor untuk Siswa.
 */
data class CatatanEvaluasi(
    val id: Int = 0,
    val jadwalSesiId: Int,
    val siswaId: Int,
    val tentorId: Int,
    val statusKehadiran: String, // "Hadir", "Izin", "Alpa"
    val nilaiKuis: Int,          // Rentang nilai 0 - 100
    val catatanFeedback: String,
    val tanggalEvaluasi: String
)
