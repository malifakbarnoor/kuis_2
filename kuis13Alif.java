import java.util.Scanner;
public class kuis13Alif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        int maxWaktu = -1;
        int kendaraanTerlama = 0;

        
        do {

            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();

            if (jam == 0) {
                int biaya = 0;
                System.out.println("Biaya parkir: Rp " + biaya);
                break;
            }
           
             if (jam < 1 || jam > 24) {
                System.out.println("input tidak valid! silahkan input ulang");
                continue;
             }
               // Tarif: jam pertama Rp 5000, jam berikutnya Rp 3000 per jam
               int biaya = 5000 + (jam - 1) * 3000;
               total += biaya;
               jumlahKendaraan++;

             if (jam > maxWaktu) {
                maxWaktu = jam;
                kendaraanTerlama = jumlahKendaraan;
             }
            
        } while (jam != 0);

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Kendaraan parkir terlama: " + kendaraanTerlama);
        
    }
}