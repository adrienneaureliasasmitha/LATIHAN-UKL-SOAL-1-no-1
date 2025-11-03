import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
  Scanner input = new Scanner(System.in);

//SOAL 1 NOMOR 1 
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double tarifPerKg;
        if (jarak <= 10) {
            tarifPerKg = 4250;
        } else {
            tarifPerKg = 6000;
        }

        double biayaBerat = berat * tarifPerKg;
        double biayaVolume = (volume > 100) ? 50000 : 0;
        double totalBiaya = biayaBerat + biayaVolume;

        System.out.println("\n--- Rincian Biaya Pengiriman ---");
        System.out.println("Berat paket   : " + berat + " kg");
        System.out.println("Jarak tempuh  : " + jarak + " km");
        System.out.println("Volume paket  : " + volume + " cm³");
        System.out.println("Biaya per kg  : Rp " + tarifPerKg);
        System.out.println("Biaya berat   : Rp " + biayaBerat);
        System.out.println("Biaya volume  : Rp " + biayaVolume);
        System.out.println("Total biaya   : Rp " + totalBiaya);

         input.close();       
        
    }
}
