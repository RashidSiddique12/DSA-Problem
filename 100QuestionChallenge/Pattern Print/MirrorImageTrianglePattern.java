import java.util.Scanner;

public class MirrorImageTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        // handle upar part
        for (int i = 1; i <= n; i++) {
            // handle space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // handle lower parth
        for (int i = n - 1; i >= 1; i--) {
            // handle space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

// 1 2 3 4 5 6
// 2 3 4 5 6
// 3 4 5 6
// 4 5 6
// 5 6
// 6
// 5 6
// 4 5 6
// 3 4 5 6
// 2 3 4 5 6
// 1 2 3 4 5 6