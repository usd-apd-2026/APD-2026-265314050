import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int jumlahBarang;
        int kapasitasPaket;
        int paketPenuh;
        int sisa;

        System.out.print("Jumlah barang: ");
        jumlahBarang = cin.nextInt();

        System.out.print("Kapasitas paket: ");
        kapasitasPaket = cin.nextInt();

        paketPenuh = jumlahBarang / kapasitasPaket;
        sisa = jumlahBarang % kapasitasPaket;

        System.out.println("Paket penuh = " + paketPenuh);
        System.out.println("Sisa barang = " + sisa);
    }
}