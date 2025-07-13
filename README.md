## 📌 Sistem Reservasi Lapangan Futsal (Final Project Java)

### 👤 Nama: Dimas Febryan Pangestu

🆔 NPM: 2310010645

🏫 Kelas: 4A\_PB01


## 📖 Deskripsi Proyek

Program ini merupakan proyek akhir mata kuliah Pemrograman Berorientasi Objek (PBO1) menggunakan bahasa Java. Aplikasi ini dibuat untuk mengelola reservasi lapangan futsal, mulai dari input data pelanggan, memilih lapangan, hingga perhitungan total biaya sewa.

## 🎯 Fitur Utama

* Input data pelanggan (nama & nomor HP)
* Menampilkan daftar lapangan futsal
* Memilih lapangan berdasarkan kode
* Input durasi sewa (dalam jam)
* Hitung total biaya
* Menampilkan ringkasan/resi reservasi


## 🛠️ Konsep OOP yang Digunakan

| No | Konsep OOP         | Implementasi                                 |
| -- | ------------------ | -------------------------------------------- |
| 1  | Class              | `Lapangan`, `Pelanggan`, `Reservasi`, `Main` |
| 2  | Object             | Pembuatan objek dari class di `Main.java`    |
| 3  | Attribute          | Properti seperti `nama`, `hargaPerJam`, dll  |
| 4  | Constructor        | Digunakan di semua class                     |
| 5  | Mutator (Setter)   | Mengatur nilai atribut                       |
| 6  | Accessor (Getter)  | Mengambil nilai atribut                      |
| 7  | Encapsulation      | Atribut `private` + method getter/setter     |
| 8  | Inheritance        | *(bisa dikembangkan jika ada)*               |
| 9  | Polymorphism       | *(belum digunakan)*                          |
| 10 | Seleksi            | `if`, `else`, `switch`                       |
| 11 | Perulangan         | `for` loop untuk cari lapangan               |
| 12 | Penggunaan Scanner | Input dari pengguna                          |
| 13 | Array/List         | Menyimpan daftar lapangan dan reservasi      |
| 14 | Error Handling     | Validasi kode lapangan tidak ditemukan       |


## 📦 Struktur File

```bash
├── Main.java           # Program utama
├── Lapangan.java       # Class untuk data lapangan
├── Pelanggan.java      # Class untuk data pelanggan
├── Reservasi.java      # Class untuk reservasi
├── Database.java       # Menyimpan list lapangan & reservasi
├── README.md           # Penjelasan proyek ini


## 🎥 Video Penjelasan

https://drive.google.com/file/d/abc123xyz/view

## ✅ Cara Menjalankan Program

1. Buka folder ini di **VSCode**
2. Jalankan file `Main.java`

   * Klik kanan → **Run Java**
   * atau via terminal:

     ```bash
     javac *.java
     java Main
     ```

Makasih
