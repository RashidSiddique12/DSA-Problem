import java.util.Scanner;

public class rightMostDifferentbit {

    static int ans(int x)
    {
        if(x==0) { return 0;}

        return (int)((Math.log10(x & -x))/ Math.log10(2)) + 1;
    }

    static int getrightmostbit(int n, int m)
    {
        int result;
        if(n == m) {result = -1;}
        else
        {
            result = ans(n ^ m);
        }
        return result;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Entre m : ");
        int m = sc.nextInt();
        System.out.println(getrightmostbit(n,m));


    }
}