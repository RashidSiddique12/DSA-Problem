import java.util.Scanner;

public class HollowReverseTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            // space handle
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // handle middle space and star
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
