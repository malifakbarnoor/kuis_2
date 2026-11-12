import java.util.Scanner;
public class kuis13Alif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        int maxWaktu = -1;

        System.out.print("Lama parkir (jam, 0 = selesai): ");
        jam = sc.nextInt();
        for (int i = 0; i <= jumlahKendaraan; i++){

           while (jam != 0) {
            // Tarif: jam pertama Rp 5000, jam berikutnya Rp 3000 per jam
            int biaya = 5000 + (jam - 1) * 3000;
            total = biaya;
            System.out.println("Biaya parkir: Rp " + biaya);

            System.out.print("Lama parkir (jam, 0 = selesai): ");
             if (jam < 1 || jam > 24) {
                System.out.print("input tidak valid! silahkan input ulang");
             }

             if (jam > maxWaktu) {
                maxWaktu = jam;
             }
            break;
         }
        }
        
        
        jumlahKendaraan++;

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Kendaraan parkir terlama: " + i);
    }
}