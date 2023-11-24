package Tugas3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaurantApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menuRestoran = new Menu();
        Pesanan pesanan = new Pesanan();

        // Menambahkan beberapa item menu ke dalam menu restoran
        menuRestoran.tambahMenuItem(new Makanan("Nasi Goreng", 10.0, "Nasi"));
        menuRestoran.tambahMenuItem(new Minuman("Es Teh", 2.0, "Teh"));
        menuRestoran.tambahMenuItem(new Diskon("Diskon Spesial", 0.0, 20.0));

        int pilihan;

        do {
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Tambah Item Menu");
            System.out.println("2. Tampilkan Menu Restoran");
            System.out.println("3. Pesan Menu");
            System.out.println("4. Tampilkan Struk Pesanan");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu: ");
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan buffer
            } catch (InputMismatchException e) {
                System.out.println("Masukkan angka yang valid.");
                scanner.nextLine(); // Membersihkan buffer
                pilihan = 0;
            }

            switch (pilihan) {
                case 1:
                    tambahItemMenu(scanner, menuRestoran);
                    break;
                case 2:
                    menuRestoran.tampilMenuRestoran();
                    break;
                case 3:
                    pesanMenu(scanner, menuRestoran, pesanan);
                    break;
                case 4:
                    pesanan.tampilStruk();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (pilihan != 5);
    }

    private static void tambahItemMenu(Scanner scanner, Menu menuRestoran) {
        System.out.print("Masukkan jenis menu (Makanan/Minuman/Diskon): ");
        String jenisMenu = scanner.nextLine();

        System.out.print("Masukkan nama menu: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan harga menu: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); // Membersihkan buffer

        MenuItem item;

        switch (jenisMenu.toLowerCase()) {
            case "makanan":
                System.out.print("Masukkan jenis makanan: ");
                String jenisMakanan = scanner.nextLine();
                item = new Makanan(nama, harga, jenisMakanan);
                break;
            case "minuman":
                System.out.print("Masukkan jenis minuman: ");
                String jenisMinuman = scanner.nextLine();
                item = new Minuman(nama, harga, jenisMinuman);
                break;
            case "diskon":
                System.out.print("Masukkan besar diskon (%): ");
                double diskon = scanner.nextDouble();
                scanner.nextLine(); // Membersihkan buffer
                item = new Diskon(nama, harga, diskon);
                break;
            default:
                System.out.println("Jenis menu tidak valid.");
                return;
        }

        menuRestoran.tambahMenuItem(item);
        System.out.println("Item menu berhasil ditambahkan.");
    }

    private static void pesanMenu(Scanner scanner, Menu menuRestoran, Pesanan pesanan) {
        menuRestoran.tampilMenuRestoran();

        System.out.print("Masukkan nama menu yang akan dipesan: ");
        String namaMenu = scanner.nextLine();

        MenuItem itemMenu = menuRestoran.getItemByNama(namaMenu);

        if (itemMenu != null) {
            pesanan.tambahItemPesanan(itemMenu);
            System.out.println("Menu berhasil dipesan.");
        } else {
            System.out.println("Menu tidak ditemukan dalam daftar.");
        }
    }
}
