package Tugas3;

public abstract class MenuItem {
    private String nama;
    private double harga;
    private String kategori;

    public MenuItem(String nama, double harga, String kategori) {
        if (nama == null || kategori == null || harga < 0) {
            throw new IllegalArgumentException("Nama, kategori, dan harga harus valid.");
        }

        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }

    // Metode abstrak
    public abstract void tampilMenu();

    @Override
    public String toString() {
        return "Nama: " + nama + ", Harga: " + harga + ", Kategori: " + kategori;
    }
}
