# Aplikasi To-Do List Java

Aplikasi To-Do List sederhana berbasis command-line (CLI) yang dibangun dengan bahasa pemrograman Java menggunakan **Layered Architecture** yang mengikuti prinsip **Clean Architecture**.

## Fitur

- **Tampilkan To-Do List**: Melihat daftar rencana atau tugas.
- **Tambah To-Do List**: Menambahkan tugas baru ke dalam daftar.
- **Hapus To-Do List**: Menghapus tugas berdasarkan nomor urut.
- **Resizing Otomatis**: Repository secara otomatis memperbesar kapasitas penyimpanan jika daftar penuh.

## Struktur Proyek

Proyek ini menggunakan pemisahan tanggung jawab (Separation of Concerns) yang jelas:

- `entity`: Berisi model data inti (`TodoList`).
- `repository`: Menangani manipulasi data (Data Access Layer).
- `service`: Berisi logika bisnis aplikasi (Business Logic Layer).
- `view`: Menangani tampilan dan interaksi pengguna (Presentation Layer).
- `util`: Utilitas pembantu seperti input scanner.
- `test`: Berisi file pengujian manual untuk memastikan setiap komponen berjalan benar.
- `src/TodoListApp.java`: Titik masuk utama (Main Entry Point) aplikasi.

## Prasyarat

- Java Development Kit (JDK) 8 atau yang lebih baru.

## Cara Menjalankan

1. **Buka Terminal/Command Prompt** di direktori utama proyek (root).
2. **Masuk ke direktori `src`**:
   ```bash
   cd src
   ```
3. **Kompilasi Program**:
   ```bash
   javac TodoListApp.java entity/*.java repository/*.java service/*.java view/*.java util/*.java
   ```
4. **Jalankan Aplikasi**:
   ```bash
   java TodoListApp
   ```

## Contoh Penggunaan

Saat dijalankan, Anda akan melihat menu utama:

```text
TodoList
1. Belajar Java
2. Ngoding
MENU : 
1. Tambah
2. Hapus
x. Keluar
Pilih : 
```

