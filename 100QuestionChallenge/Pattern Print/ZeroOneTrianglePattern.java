import java.util.Scanner;

public class ZeroOneTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt() % 10;
        boolean flag = false;
        boolean temp;

        for (int i = 1; i <= n; i++) {
            flag = !flag;
            temp = flag;
            for (int j = 1; j <= i; j++) {
                if (flag == true) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                flag = !flag;
            }
            System.out.println();
            flag = temp;
        }

    }
}

// other method => i+j sum is even print 1 ,else print 0
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// 0 1 0 1 0 1