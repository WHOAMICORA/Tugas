package Tugas3;
class Diskon extends MenuItem {
    private double diskon;

    public Diskon(String nama, double harga, double diskon) {
        super(nama, harga, "Diskon");
        this.diskon = diskon;
    }

    @Override
    public void tampilMenu() {
        System.out.println(getNama() + " (Diskon)");
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga: $" + getHarga());
        System.out.println("--------------------");
    }
}
