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
        System.out.print("\nJudul buku yang ingin dipinjam: ");
        String judul = input.nextLine();
        perpus.kurangiStok(judul);

        // Menampilkan ulang daftar buku setelah stok dikurangi
        System.out.println("\n=== Data Buku Setelah Peminjaman ===");
        perpus.tampilkanBuku();

        input.close();
    }
}
