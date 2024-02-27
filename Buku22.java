public class Buku22 {

    String judul, pengarang;
    int halaman, stok, harga;

    // Constructors
    public Buku22() {

    }

    public Buku22(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman:" + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            if (jml <= stok) {
                stok -= jml;
                System.out.println(jml + " buku terjual.");
            } else {
                System.out.println("Stok tidak mencukupi untuk melakukan penjualan sebanyak " + jml + " buku.");
            }
        } else {
            System.out.println("Stok sudah habis. Tidak dapat melakukan penjualan.");
        }
    }

    void restock(int jml) {
        stok += jml;
        System.out.println(jml + " buku berhasil ditambahkan ke dalam stok.");
    }

    void gantiHarga(int hrg) {
        harga = hrg;
        System.out.println("Harga buku berhasil diubah menjadi Rp " + harga);
    }

    public static void main(String[] args) {
        Buku22 buku1 = new Buku22();
        buku1.judul = "Judul Buku 1";
        buku1.pengarang = "Pengarang Buku 1";
        buku1.halaman = 200;
        buku1.stok = 10;
        buku1.harga = 50000;

        buku1.tampilInformasi();
        buku1.terjual(5);
        buku1.tampilInformasi();
        buku1.terjual(10); // Tidak akan terjual karena stok tidak mencukupi
        buku1.tampilInformasi();
        buku1.restock(15); // Menambah stok sebanyak 15 buku
        buku1.tampilInformasi();
    }
}
