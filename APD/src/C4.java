import java.util.Scanner;

public class C4 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        final String TOKO = "Toko Belajar Java";

        String firstName;
        String lastName;
        String namaBarang;
        String fullName;

        double hargaSatuan;
        int jumlah;
        double subtotal;

        System.out.print("Nama depan: ");
        firstName = cin.nextLine();

        System.out.print("Nama belakang: ");
        lastName = cin.nextLine();

        System.out.print("Nama barang: ");
        namaBarang = cin.nextLine();

        System.out.print("Harga satuan: ");
        hargaSatuan = Double.parseDouble(cin.nextLine());

        System.out.print("Jumlah: ");
        jumlah = Integer.parseInt(cin.nextLine());

        fullName = firstName + " " + lastName;
        subtotal = hargaSatuan * jumlah;

        System.out.println();
        System.out.println("=== RINGKASAN TRANSAKSI ===");
        System.out.println("Nama toko: " + TOKO);
        System.out.println("Pembeli: " + fullName);
        System.out.println("Barang: " + namaBarang);
        System.out.println("Harga: " + hargaSatuan + " | Jumlah: " + jumlah);
        System.out.println("Subtotal: " + subtotal);
    }
}