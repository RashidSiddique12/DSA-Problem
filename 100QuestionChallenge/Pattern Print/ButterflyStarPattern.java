import java.util.Scanner;

public class ButterflyStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        // upper
        for (int i = 1; i <= n; i++) {
            // left star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // right start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower
        for (int i = n; i >= 1; i--) {
            // left
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // right
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
