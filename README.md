# 0263_bimbeltrack

> **BimbelTrack: Sistem Informasi Penjadwalan & Manajemen Sesi Bimbingan Belajar Siswa**  
> Proyek Ujian Akhir Semester Mata Kuliah Pengembangan Aplikasi Mobile (PAM) 2026  
> **NIM:** 20240150263  
> **Akun GitHub:** [@Andhikaryanstito](https://github.com/Andhikaryanstito)  
> **Kelas:** PAM  

---

## ?? Deskripsi Proyek
**BimbelTrack** adalah aplikasi bimbingan belajar akademik berbasis Android native (**Jetpack Compose**, **MVVM**) yang terintegrasi dengan REST API backend MySQL. Aplikasi ini mendigitalkan pencatatan sesi les dan presensi belajar siswa, serta memfasilitasi komunikasi akademik antara dua role pengguna:

1. **Role Siswa:** Memilih program bimbingan belajar, menentukan jadwal sesi bimbingan dengan tentor, memantau kehadiran sesi, serta melihat riwayat E-Rapor perkembangan belajar.
2. **Role Tentor:** Mengatur ketersediaan jadwal mengajar, mencatat kehadiran sesi les (Hadir, Izin, Alpa), serta menginput nilai latihan kuis (skor 0–100) dan catatan evaluasi belajar siswa.

---

## ??? Pemenuhan Rubrik Penilaian PAM 2026

| No | Kategori Rubrik | Implementasi pada BimbelTrack | Status |
|:--:|:---|:---|:--:|
| 1 | **Authentication** | Login & Register dengan JWT (Access Token & Refresh Token) | ?? Sedang Disiapkan |
| 2 | **Authorization** | 2 Level Role: **Siswa** (Katalog, Booking, Rapor) & **Tentor** (Presensi, Penilaian) | ? Terstruktur |
| 3 | **Navigasi & Routing** | Multi-page app murni menggunakan **Navigation Compose** (`Screen.kt`) | ? Terimplementasi |
| 4 | **State Management** | Arsitektur **MVVM** (Model-View-ViewModel + StateFlow) | ? Terstruktur |
| 5 | **Tabel / Entitas Data** | 4 Entitas Relasional MySQL: `ProgramBimbel`, `ProfilTentor`, `JadwalSesi`, `CatatanEvaluasi` | ? Model Terdefinisi |
| 6 | **5 Fitur CRUDS** | **Create:** Booking Sesi & Input Nilai<br>**Read:** Jadwal Belajar & E-Rapor<br>**Update:** Presensi Kehadiran Sesi<br>**Delete:** Pembatalan Jadwal Sesi<br>**Search:** Pencarian Katalog Program Belajar | ?? Sedang Berjalan |
| 7 | **REST API Integration** | HTTP Client Retrofit2/Ktor dengan serialisasi JSON ke server database | ? Tahap Berikutnya |
| 8 | **Database** | Database server MySQL (*Zero Room Database sesuai aturan pedoman*) | ? Tahap Berikutnya |
| 9 | **File Storage** | Simpan dan baca file lokal: Export rekapitulasi laporan perkembangan belajar siswa (PDF) | ? Tahap Berikutnya |
| 10 | **UI/UX** | Antarmuka matang murni dengan Jetpack Compose Material 3 | ?? On Progress |

---

## ?? Struktur Direktori Proyek (MVVM Architecture)

```text
com.example.a0263_bimbeltrack/
+-- data/
¦   +-- model/         # 4 Entitas Utama (ProgramBimbel, ProfilTentor, JadwalSesi, CatatanEvaluasi)
¦   +-- remote/        # Konfigurasi Retrofit API Service & DTO
¦   +-- repository/    # Repository penghubung data remote dengan ViewModel
+-- ui/
¦   +-- components/    # Komponen Reusable Jetpack Compose (Button, Card, Dialog)
¦   +-- navigation/    # Rute dan Graph Navigasi Compose (Screen.kt)
¦   +-- screens/       # Halaman antarmuka untuk role Siswa dan Tentor
¦   +-- theme/         # Material Theme (Color, Typography, Shape)
+-- MainActivity.kt    # Entry point aplikasi
```

---

## ?? Log Progress Mingguan (Pertemuan 9 - 16)

| Minggu / Pertemuan | Rincian Aktivitas & File yang Dikerjakan | Commit Terkait | Status |
|:---|:---|:---|:--:|
| **Pertemuan 9** | • Inisialisasi awal proyek Android murni Jetpack Compose.<br>• Pembuatan struktur paket folder arsitektur MVVM (`data/`, `ui/`). | `5ae2c49`<br>`e245f37` | ? Selesai |
| **Pertemuan 10** | • Pembuatan data class 4 entitas utama (`ProgramBimbel`, `ProfilTentor`, `JadwalSesi`, `CatatanEvaluasi`).<br>• Perancangan rute navigasi `Screen.kt` untuk role Siswa & Tentor.<br>• Dokumentasi resmi spesifikasi proyek pada `README.md`. | `a3d21ac`<br>`ec9d057`<br>`[Current]` | ? Selesai |
| **Pertemuan 11** | Konfigurasi Retrofit REST API Client, Data Transfer Object (DTO), dan autentikasi login/register JWT. | - | ? Terjadwal |
| **Pertemuan 12** | Implementasi antarmuka dan logika Siswa: Katalog program, fitur pencarian/filter, dan booking sesi bimbingan (Create & Read). | - | ? Terjadwal |
| **Pertemuan 13** | Implementasi antarmuka dan logika Tentor: Daftar sesi mengajar, pencatatan presensi kehadiran, dan input nilai kuis (Update). | - | ? Terjadwal |
| **Pertemuan 14** | Implementasi pembatalan jadwal sesi (Delete) dan fitur File Storage lokal (Unduh & Baca Dokumen Rapor Belajar PDF). | - | ? Terjadwal |
| **Pertemuan 15** | UI/UX Polish, validasi form input, penanganan error jaringan/koneksi API, dan pembersihan bug fatal. | - | ? Terjadwal |
| **Pertemuan 16** | Verifikasi kepatuhan SRS, penyusunan dokumentasi teknis akhir, dan persiapan demo aplikasi tugas akhir. | - | ? Terjadwal |
