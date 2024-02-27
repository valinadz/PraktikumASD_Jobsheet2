public class Buku22 {

    String judul, pengarang;
    int halaman, stok, harga;

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
    }

    void gantiHarga(int hrg) {
        harga = hrg;
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
    }
}
