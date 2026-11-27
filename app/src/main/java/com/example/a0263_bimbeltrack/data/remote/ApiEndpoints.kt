package com.example.a0263_bimbeltrack.data.remote

/**
 * Daftar alamat endpoint REST API BimbelTrack (terhubung ke 0263_API_bimbeltrack).
 */
object ApiEndpoints {
    // 10.0.2.2 mengarah ke localhost laptop saat pengujian di Android Emulator
    const val BASE_URL = "http://10.0.2.2:3000/api/"

    // Autentikasi JWT
    const val REGISTER = "auth/register"
    const val LOGIN = "auth/login"
    const val REFRESH_TOKEN = "auth/refresh"

    // 4 Entitas Utama
    const val PROGRAMS = "programs"
    const val PROFIL_TENTOR = "tentor/profil"
    const val JADWAL_SESI = "jadwal"
    const val CATATAN_EVALUASI = "evaluasi"
}