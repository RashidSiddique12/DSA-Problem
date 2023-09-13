import java.util.Scanner;

public class HollowTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // handle outside space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // handle star and inside space
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

// *
// * *
// * *
// * *
// * *
// ***********