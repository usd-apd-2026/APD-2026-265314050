import java.util.Scanner;

public class C0 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        String nama;
        int umur;

        System.out.print("Nama: ");
        nama = cin.nextLine();

        System.out.print("Umur: ");
        umur = Integer.parseInt(cin.nextLine());

        System.out.println("Halo " + nama + ", umur " + umur);
    }
}