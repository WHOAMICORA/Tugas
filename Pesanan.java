package Tugas3;
import java.util.ArrayList;

// Kelas Pesanan
class Pesanan {
    private ArrayList<MenuItem> itemPesanan = new ArrayList<>();

    public void tambahItemPesanan(MenuItem item) {
        itemPesanan.add(item);
    }

    public void tampilStruk() {
        System.out.println("=== Struk Pesanan ===");
        for (MenuItem item : itemPesanan) {
            item.tampilMenu();
        }
        System.out.println("=====================");
        System.out.println("Total Biaya: $" + hitungTotalBiaya());
    }

    public double hitungTotalBiaya() {
        double total = 0;
        for (MenuItem item : itemPesanan) {
            total += item.getHarga();
        }
        return total;
    }
}
