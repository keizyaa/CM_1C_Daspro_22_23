import java.util.Scanner;

public class CM_1C_Daspro_22_23 {
    
    static String[] namaItem = new String[10];
    static String[] kategoriItem = new String[10];
    static int[] stokItem = new int[10];
    static int jmlItem = 0; 
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        namaItem[jmlItem] = "Kopi Hitam";
        kategoriItem[jmlItem] = "Minuman";
        stokItem[jmlItem++] = 10;

        namaItem[jmlItem] = "Cappuccino";
        kategoriItem[jmlItem] = "Minuman";
        stokItem[jmlItem++] = 5;

        namaItem[jmlItem] = "Teh Tarik";
        kategoriItem[jmlItem] = "Minuman";
        stokItem[jmlItem++] = 8;
        
        while (true) {
            menu();
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilData();
                    break;
                case 2:
                    tambahStok();
                    break;
                case 3:
                    tambahItem();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
    static void menu() {
        System.out.println("======= MENU INVENTORI KAFE =======");
        System.out.println("1. Tampilkan Inventori");
        System.out.println("2. Tambah Stok untuk Item yang Ada");
        System.out.println("3. Tambah Item");
        System.out.println("4. Exit");
        System.out.print("Pilih menu: ");
    }
    static void tampilData() {
        System.out.println("==================== DATA INVENTORI ==================== ");
        System.out.println("No\tNama Item\tKategori\tStok");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < jmlItem; i++) {
           System.out.printf("%d\t%s\t%s\t\t%d\n", (i + 1), namaItem[i], kategoriItem[i], stokItem[i]);
        }
    }

    static void tambahStok() {
        tampilData();
        System.out.println("=============== TAMBAH STOK ===============");
        System.out.print("Masukkan nomor item: ");
        int nomor = sc.nextInt();
        System.out.print("Masukkan jumlah stok yang ingin ditambahkan: ");
        int tambahanStok = sc.nextInt();

        if (nomor > 0 && nomor <= jmlItem) {
            stokItem[nomor - 1] += tambahanStok;
            System.out.println("Stok " + namaItem[nomor - 1] + " berhasil ditambah. Stok sekarang: " + stokItem[nomor - 1]);
        } else {
            System.out.println("Nomor item tidak valid.");
        }
    }

    static void tambahItem() {
        if (jmlItem >= namaItem.length) {
            System.out.println("Inventori penuh! Tidak bisa menambahkan item baru.");
            return;
        }

        System.out.println("=============== TAMBAH ITEM ===============");
        System.out.print("Masukkan nama item: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan kategori item: ");
        String kategori = sc.nextLine();
        System.out.print("Masukkan stok item: ");
        int stok = sc.nextInt();

        namaItem[jmlItem] = nama;
        kategoriItem[jmlItem] = kategori;
        stokItem[jmlItem] = stok;
        jmlItem++;

        System.out.println("Item baru berhasil ditambahkan: " + nama + " (" + kategori + ") - Stok: " + stok);
    }
}