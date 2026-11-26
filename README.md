# 0263_bimbeltrack

> **BimbelTrack: Sistem Informasi Penjadwalan & Manajemen Sesi Bimbingan Belajar Siswa**  
> Proyek Tugas Akhir Mata Kuliah Pengembangan Aplikasi Mobile (PAM) 2026  
> **NIM:** 20240150263  
> **Akun GitHub:** [@Andhikaryanstito](https://github.com/Andhikaryanstito)  
> **API Repository:** [0263_API_bimbeltrack](https://github.com/Andhikaryanstito/0263_API_bimbeltrack)  

---

## 1. Deskripsi Proyek
**BimbelTrack** adalah aplikasi bimbingan belajar akademik berbasis Android native (**Kotlin, Jetpack Compose, MVVM**) yang terintegrasi dengan layanan REST API backend **PostgreSQL**. Aplikasi ini mendigitalkan pencatatan sesi bimbingan dan presensi belajar siswa, serta memfasilitasi interaksi akademik antara dua peran pengguna:

1. **Role Siswa:** Melihat dan mencari program bimbingan belajar, melihat profil serta jadwal ketersediaan tentor, memesan jadwal sesi bimbingan, mengubah atau membatalkan jadwal, melihat riwayat presensi serta evaluasi nilai latihan, dan mengunduh lembar perkembangan belajar (PDF).
2. **Role Tentor:** Mengelola daftar program bimbingan, mengatur jadwal ketersediaan mengajar, menyetujui atau membatalkan sesi masuk, mencatat kehadiran siswa (Hadir, Izin, Alpa), mengisi nilai latihan serta catatan evaluasi, dan mengunduh laporan rekapitulasi sesi mengajar (PDF).

---

## 2. Arsitektur & Pemenuhan Rubrik PAM 2026

| No | Kategori Rubrik | Implementasi pada BimbelTrack | Status |
|:--:|:---|:---|:---:|
| 1 | **Authentication** | Login & Register dengan JWT (Access Token & Refresh Token) | :hourglass_flowing_sand: Terjadwal (Minggu 3) |
| 2 | **Authorization** | 2 Level Peran: **Siswa** & **Tentor** (Role-Based UI) | :white_check_mark: Rute Terstruktur |
| 3 | **Navigasi & Routing** | Multi-page app murni menggunakan **Navigation Compose** (`Screen.kt`) | :white_check_mark: Kerangka Siap |
| 4 | **State Management** | Arsitektur **MVVM** (Model-View-ViewModel) | :white_check_mark: Struktur Siap |
| 5 | **Tabel / Entitas Data** | 4 Entitas Relasional PostgreSQL: `ProgramBimbel`, `ProfilTentor`, `JadwalSesi`, `CatatanEvaluasi` | :white_check_mark: Model Terdefinisi |
| 6 | **5 Fitur CRUDS** | Create, Read, Update, Delete, dan Search terintegrasi pada kedua peran | :hourglass_flowing_sand: Tahap Implementasi |
| 7 | **REST API & Database** | HTTP Client ke backend `0263_API_bimbeltrack` dengan **PostgreSQL** (tanpa Room DB) | :hourglass_flowing_sand: Tahap Implementasi |
| 8 | **File Storage** | Simpan dan baca berkas laporan PDF perkembangan belajar & rekap sesi di perangkat | :hourglass_flowing_sand: Terjadwal |
| 9 | **UI/UX** | Antarmuka murni menggunakan **Jetpack Compose** Material 3 | :hourglass_flowing_sand: Tahap Implementasi |

---

## 3. Struktur Direktori Proyek (MVVM)

```text
com.example.a0263_bimbeltrack/
├── data/
│   ├── model/         # 4 Entitas Utama (ProgramBimbel, ProfilTentor, JadwalSesi, CatatanEvaluasi)
│   ├── remote/        # Konfigurasi Retrofit API Service & DTO
│   └── repository/    # Repository penghubung data REST API dengan ViewModel
├── ui/
│   ├── components/    # Komponen reusable Jetpack Compose
│   ├── navigation/    # Rute dan graph Navigation Compose (Screen.kt)
│   ├── screens/       # Halaman antarmuka untuk peran Siswa dan Tentor
│   └── theme/         # Material Theme (Color, Typography, Shape)
└── MainActivity.kt    # Entry point aplikasi
```

---

## 4. Progress Mingguan (Weekly Progress)

Berikut adalah linimasa pengembangan proyek **BimbelTrack** berdasarkan riwayat git commit secara bertahap:

### :date: Minggu 1 / Pertemuan 9 (16 November 2026 - 22 November 2026)
* **Inisiasi & Setup Proyek** ( `5ae2c49` , `e245f37` ): Initial commit proyek Android Jetpack Compose, konfigurasi `.gitignore`, Gradle Kotlin DSL, serta penataan kerangka struktur folder arsitektur MVVM (`data/model`, `data/remote`, `data/repository`, `ui/components`, `ui/navigation`, `ui/screens`).
* **Model Entitas & Rute Navigasi Awal** ( `a3d21ac` , `ec9d057` , `3dd44f8` ): Pembuatan 4 data class entitas utama (`ProgramBimbel`, `ProfilTentor`, `JadwalSesi`, `CatatanEvaluasi`), penyiapan rute dasar `Screen.kt` berbasis Navigation Compose untuk peran Siswa serta Tentor, dan dokumentasi awal `README.md`.

### :date: Minggu 2 / Pertemuan 10 (23 November 2026 - 29 November 2026)
* **Sinkronisasi Dokumentasi & Persiapan Backend** ( *commit ini* ): Penyelarasan spesifikasi basis data **PostgreSQL**, penautan repositori backend `0263_API_bimbeltrack`, serta pembaruan format catatan progress mingguan pada `README.md` selama tahap finalisasi dokumen SRS.