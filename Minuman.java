package Tugas3;
class Minuman extends MenuItem {
    private String jenisMinuman;

    public Minuman(String nama, double harga, String jenisMinuman) {
        super(nama, harga, "Minuman");
        this.jenisMinuman = jenisMinuman;
    }

    @Override
    public void tampilMenu() {
        System.out.println(getNama() + " (Minuman)");
        System.out.println("Jenis: " + jenisMinuman);
        System.out.println("Harga: $" + getHarga());
        System.out.println("--------------------");
    }
}
