import java.util.Scanner;

public class SquareHollowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 2; i <= n - 1; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }

    }
}
