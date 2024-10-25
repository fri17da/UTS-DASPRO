import java.util.Scanner;
public class nilaiSiswa23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahSiswa = 0;
        int totalNilai = 0;
        int jumlahAtasRata = 0;
        int jumlahBawahRata = 0;
        boolean lanjut = true;
        System.out.println("Masukkan data siswa:");
        while (lanjut) {
            System.out.print("Nama siswa: ");
            String namaSiswa = sc.nextLine();
            System.out.print("Nilai ujian: ");
            int nilaiUjian = sc.nextInt();
            sc.nextLine(); 

            totalNilai += nilaiUjian;
            jumlahSiswa++;

            double rataRata = (double) totalNilai / jumlahSiswa;

            if (nilaiUjian > totalNilai / jumlahSiswa) {
                jumlahAtasRata++;
            } else if (nilaiUjian < totalNilai / jumlahSiswa) {
                jumlahBawahRata++;
            }
    
            System.out.print("Lanjutkan input data siswa? (Selesai/lanjut): ");
            String jawaban = sc.nextLine();
            if (jawaban.equalsIgnoreCase("selesai")) {
                lanjut = false;
            }
        }
        double rataRataAkhir = (double) totalNilai / jumlahSiswa;
        System.out.println("Hasil program:");
        System.out.println("Rata-rata nilai kelas: " + rataRataAkhir);
        System.out.println("Jumlah siswa di atas rata-rata: " + jumlahAtasRata);
        System.out.println("jumlah siswa di bawah rata-rata: " + jumlahBawahRata);
        if (jumlahAtasRata > jumlahBawahRata) {
            System.out.println("Mayoritas siswa memiliki nilai di atas rata-rata.");
        } else if (jumlahBawahRata > jumlahAtasRata) {
            System.out.println("Mayoritas siswa memiliki nilai di bawah rata-rata.");
        } 
        System.out.println();
    }
}

