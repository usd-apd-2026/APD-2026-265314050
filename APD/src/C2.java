import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        double a, b, c;
        double total;
        double average;

        System.out.print("Nilai 1: ");
        a = cin.nextDouble();

        System.out.print("Nilai 2: ");
        b = cin.nextDouble();

        System.out.print("Nilai 3: ");
        c = cin.nextDouble();

        total = a + b + c;
        average = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Rata-rata = " + average);
    }
}