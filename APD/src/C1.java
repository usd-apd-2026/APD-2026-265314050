import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int a, b;

        System.out.print("Masukkan a: ");
        a = cin.nextInt();

        System.out.print("Masukkan b: ");
        b = cin.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a * 1.0 / b = " + (a * 1.0 / b));
        System.out.println("a % b = " + (a % b));
    }
}