import java.util.Scanner;

public class SentencePalindrome {
    public static boolean check(String s) {
        String s1 = s.toLowerCase();

        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                s2.append(ch);
            }
        }

        // now check
        int i = 0, j = s2.length() - 1;
        while (i < j) {
            if (s2.charAt(i) != s2.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Entre a String ");
        // String str = sc.nextLine();
        // String str1 = str.toLowerCase();
        // // System.out.println(str1);
        // // String str2 = "";
        // StringBuilder str2 = new StringBuilder();
        // for (int i = 0; i < str1.length(); i++) {
        // char ch = str1.charAt(i);
        // if (ch >= 'a' && ch <= 'z') {
        // str2.append(ch);
        // }
        // }
        // System.out.println(str2);

        String s = "A man, a plan, a canal: Panama";
        boolean res = check(s);
        System.out.println(res);

    }
}
