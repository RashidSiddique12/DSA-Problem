import java.util.Scanner;

public class PalindromeTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt() % 10;

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // left
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // right
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
