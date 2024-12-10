import java.util.Scanner;

public class CM_1C_Daspro_22_23 {
    
    static String[] namaItem = new String[10];
    static String[] kategoriItem = new String[10];
    static int[] stokItem = new int[10];
    static int jmlItem = 0; 
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        
    }
    static void menu() {
        System.out.println("======= MENU INVENTORI KAFE =======");
        System.out.println("1. Tampilkan Inventori");
        System.out.println("2. Tambah Stok untuk Item yang Ada");
        System.out.println("3. Tambah Item");
        System.out.println("4. Exit");
    }
    static void tampilData() {
        System.out.println("======= DATA INVENTORI ======= ");
        System.out.println("No\tNama Item\tKategori\nStok");
        System.out.println("------------------------------");
        for (int i = 0; i < jmlItem; i++) {
            System.out.print((i+1) + "\t");
            System.out.print(namaItem[i] + "\t\t");
            System.out.print(kategoriItem[i] + "\t\t");
            System.out.print(stokItem[i]);
        }
    }
}