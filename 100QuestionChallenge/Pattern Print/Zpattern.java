import java.util.Scanner;

public class Zpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // middle
        for (int i = 2; i <= n - 1; i++) {
            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println(n - i + 1);
        }wq
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
