
package Tugas3;
class Makanan extends MenuItem {
    private String jenisMakanan;

    public Makanan(String nama, double harga, String jenisMakanan) {
        super(nama, harga, "Makanan");
        this.jenisMakanan = jenisMakanan;
    }

    @Override
    public void tampilMenu() {
        System.out.println(getNama() + " (Makanan)");
        System.out.println("Jenis: " + jenisMakanan);
        System.out.println("Harga: $" + getHarga());
        System.out.println("--------------------");
    }
}
