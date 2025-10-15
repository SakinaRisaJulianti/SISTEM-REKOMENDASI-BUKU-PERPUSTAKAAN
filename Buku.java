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