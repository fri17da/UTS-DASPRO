import java.util.Scanner;

public class stokBarang23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaBarang;
        int stokBarang = 0;
        int hargaPerUnit = 0;
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("=== Program Manajemen Stok Barang ===");
            System.out.print("Masukkan nama barang: ");
            namaBarang = sc.nextLine();
            System.out.print("Masukkan jumlah stok barang: ");
            stokBarang = sc.nextInt();
            System.out.print("Masukkan harga per unit barang: ");
            hargaPerUnit = sc.nextInt();
            sc.nextLine(); 
            int totalNilaiStok = stokBarang * hargaPerUnit;
            System.out.println("Total nilai stok barang: Rp" + totalNilaiStok);

            
            System.out.print("Masukkan jumlah permintaan barang: ");
            int permintaan = sc.nextInt();
            sc.nextLine(); 

            if (permintaan <= stokBarang) {
                stokBarang -= permintaan; 
                System.out.println("Permintaan barang dapat dipenuhi. Stok tersisa: " + stokBarang + " unit.");
            } else {
                System.out.println("Stok tidak mencukupi. Stok saat ini hanya: " + stokBarang + " unit.");
            }

            System.out.print("Lanjutkan input barang lain (selesai/lanjut): ");
            String jawaban = sc.nextLine();
            if (jawaban.equalsIgnoreCase("selesai")) {
                lanjut = false;
            }
        }

        System.out.println("Program selesai.");
        sc.close();
    }
}
