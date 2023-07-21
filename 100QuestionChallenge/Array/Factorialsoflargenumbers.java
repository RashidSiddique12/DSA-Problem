import java.util.ArrayList;

public class Factorialsoflargenumbers {

    public static ArrayList<Integer> factorial(int N) {

        ArrayList<Integer> list = new ArrayList<>();
        int carry = 0;
        list.add(1);
        for (int i = 2; i <= N; i++) {
            for (int listIdx = list.size() - 1; listIdx >= 0; listIdx--) {
                int product = list.get(listIdx) * i + carry;
                list.set(listIdx, product % 10);
                carry = product / 10;
            }
            while (carry != 0) {
                list.add(0, carry % 10);
                carry = carry / 10;
            }
        }

        return list;

    }

    // if number is so big then approch will not work
    // public static int factorial(int N) {
    // if (N == 0 || N == 1) {
    // return 1;
    // }
    // return N * factorial(N - 1);
    // }

    public static void main(String[] args) {
        int N = 600;
        // int res = factorial(N);
        // System.out.println(res);

        ArrayList<Integer> result = factorial(N);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }
    }
}
