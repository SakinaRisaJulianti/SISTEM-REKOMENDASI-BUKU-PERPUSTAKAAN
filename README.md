# SISTEM-REKOMENDASI-BUKU-PERPUSTAKAAN
Tugas UTS Project Pemrograman
## Kelompok 3
Nama Anggota Kelompok
- **Sakina Risa Julianti** (G1A025069)
- **Rafif Naufal Hibatullah** (G1A025079)
- **Rizqi Dimasa Jaya** (G1A025095)

## Overview Program
Perpustakaan digital ingin membuat sistem yang menyimpan data buku dan memberikan rekomendasi buku berdasarkan kategori favorit pengguna.
Program ini dibuat untuk membantu pengguna perpustakaan menemukan buku sesuai dengan minat atau kategori favorit mereka. Sistem ini menyimpan data buku yang terdiri dari judul, penulis, kategori, dan jumlah stok. Ketika pengguna memilih kategori yang disukai, sistem akan menampilkan daftar buku yang sesuai secara otomatis.
Selain itu, sistem ini juga menyediakan fitur untuk menambah data buku baru dan mengurangi stok ketika buku dipinjam. Proses rekomendasi dilakukan dengan menggunakan perulangan dan percabangan (looping dan if–else) agar buku yang ditampilkan benar-benar sesuai dengan kategori pilihan pengguna.
Melalui sistem ini, pencarian buku di perpustakaan menjadi lebih cepat dan efisien. Pengguna tidak perlu lagi mencari satu per satu di katalog karena sistem akan langsung memberikan saran buku yang relevan. Dengan begitu, kegiatan peminjaman buku menjadi lebih praktis dan pengalaman pengguna di perpustakaan menjadi lebih baik.

## Sistem Program
### 1. Buku Class
```java
public class Buku {
    private String judul;
    private String penulis;
    private String kategori;
    private int stok;

    // Constructor
    public Buku(String judul, String penulis, String kategori, int stok) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.stok = stok;
    }

    // Getter dan Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // Method untuk mengurangi stok
    public void kurangiStok() {
        if (stok > 0) {
            stok--;
        } else {
            System.out.println("Stok buku habis!");
        }
    }

    // Method untuk menampilkan info buku
    public void tampilkanInfo() {
        System.out.println("Judul    : " + judul);
        System.out.println("Penulis  : " + penulis);
        System.out.println("Kategori : " + kategori);
        System.out.println("Stok     : " + stok);
        System.out.println("-----------------------------");
    }
}
```

2. Perpustakaan Class
 ```java
 import java.util.ArrayList;
public class Perpustakaan {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    // Menambahkan buku ke daftar
    public void tambahBuku(Buku b) {
        daftarBuku.add(b);
    }

    // Menampilkan seluruh buku
    public void tampilkanBuku() {
        System.out.println("=== Daftar Buku di Perpustakaan ===");
        for (Buku b : daftarBuku) {
            b.tampilkanInfo();
        }
    }

    // Menampilkan rekomendasi buku berdasarkan kategori
    public void rekomendasiBuku(String kategori) {
        System.out.println("=== Rekomendasi Buku Kategori: " + kategori + " ===");
        boolean ditemukan = false;
        for (Buku b : daftarBuku) {
            if (b.getKategori().equalsIgnoreCase(kategori)) {
                b.tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada buku dengan kategori tersebut.");
        }
    }

    // Mengurangi stok buku berdasarkan judul
    public void kurangiStok(String judul) {
        for (Buku b : daftarBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                b.kurangiStok();
                System.out.println("Stok buku \"" + judul + "\" telah dikurangi.");
                return;
            }
        }
        System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan.");
    }
}
```
3. Main Class
 ```java  
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();

        // Menambahkan beberapa data buku ke dalam perpustakaan
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", "Fiksi", 5));
        perpus.tambahBuku(new Buku("Algoritma Pemrograman", "Rosa A. S", "Teknologi", 3));
        perpus.tambahBuku(new Buku("Belajar Java", "Budi Raharjo", "Teknologi", 4));
        perpus.tambahBuku(new Buku("Psikologi Pendidikan", "Slameto", "Pendidikan", 2));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "A. Fuadi", "Fiksi", 6));

        // Menampilkan semua buku
        perpus.tampilkanBuku();

        // Input kategori favorit dari pengguna
        System.out.print("Masukkan kategori favorit Anda: ");
        String kategori = input.nextLine();

        // Menampilkan rekomendasi buku berdasarkan kategori
        perpus.rekomendasiBuku(kategori);

        // Simulasi peminjaman buku
        System.out.print("\nMasukkan judul buku yang ingin dipinjam: ");
        String judul = input.nextLine();
        perpus.kurangiStok(judul);

        // Menampilkan ulang daftar buku setelah stok dikurangi
        System.out.println("\n=== Data Buku Setelah Peminjaman ===");
        perpus.tampilkanBuku();

        input.close();
    }
}
```
   
   

   

 




