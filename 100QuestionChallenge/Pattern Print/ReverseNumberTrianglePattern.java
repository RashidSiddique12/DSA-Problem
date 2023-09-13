import java.util.Scanner;

public class ReverseNumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // number
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