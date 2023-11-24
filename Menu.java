package Tugas3;
import java.util.ArrayList;

// Kelas Menu
class Menu {
    private ArrayList<MenuItem> daftarMenu = new ArrayList<>();

    public void tambahMenuItem(MenuItem item) {
        daftarMenu.add(item);
    }

    public void tampilMenuRestoran() {
        System.out.println("=== Menu Restoran ===");
        for (MenuItem item : daftarMenu) {
            item.tampilMenu();
        }
    }

    public MenuItem getItemByNama(String nama) {
        for (MenuItem item : daftarMenu) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                return item;
            }
        }
        return null;
    }
}
