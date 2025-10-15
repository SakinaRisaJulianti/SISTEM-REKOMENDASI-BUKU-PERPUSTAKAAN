import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

//  Menambahkan buku ke dalam daftar
    public void tambahBuku(Buku b) {
        daftarBuku.add(b);
    }

//  Menampilkan semua buku yang ada di dalam perpustakaan
    public void tampilkanBuku() {
        System.out.println("=== Daftar Buku di Perpustakaan ===");
        for (Buku b : daftarBuku) {
            b.tampilkanInfo();
        }
    }

//  Memberikan rekomendasi buku berdasarkan kategori
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

//  Mengurangi stok buku berdasarkan judul
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