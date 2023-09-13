import java.util.Scanner;

public class NumbertrianglePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt() % 10;
        for (int i = 1; i <= n; i++) {
            // for the space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // ele
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
