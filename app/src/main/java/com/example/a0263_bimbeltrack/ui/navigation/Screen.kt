package com.example.a0263_bimbeltrack.ui.navigation

/**
 * Definisi rute navigasi aplikasi BimbelTrack berbasis Navigation Compose.
 * Mendukung autentikasi, navigasi role Siswa, dan navigasi role Tentor.
 */
sealed class Screen(val route: String) {
    // Autentikasi
    object Login : Screen("login")
    object Register : Screen("register")

    // Role Siswa
    object HomeSiswa : Screen("siswa_home")
    object KatalogProgram : Screen("siswa_katalog")
    object BookingSesi : Screen("siswa_booking")
    object RaporSiswa : Screen("siswa_rapor")

    // Role Tentor
    object HomeTentor : Screen("tentor_home")
    object InputPresensiNilai : Screen("tentor_presensi/{jadwalId}") {
        fun createRoute(jadwalId: Int) = "tentor_presensi/$jadwalId"
    }
    object RekapTentor : Screen("tentor_rekap")
}
