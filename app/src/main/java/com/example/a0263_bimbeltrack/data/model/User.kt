package com.example.a0263_bimbeltrack.data.model

/**
 * Model akun pengguna untuk autentikasi JWT dan pemisahan peran (Siswa / Tentor).
 */
data class User(
    val id: Int = 0,
    val namaLengkap: String,
    val email: String,
    val role: String // "siswa" atau "tentor"
)

data class AuthResponse(
    val accessToken: String,
    val refreshToken: String,
    val user: User
)