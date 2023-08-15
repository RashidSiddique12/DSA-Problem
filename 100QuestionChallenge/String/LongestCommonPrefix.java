import java.util.*;

public class LongestCommonPrefix {

    public static String findLongestCommonPrefix(String str[]) {
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length - 1];
        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            }
            i++;
        }
        return s1.substring(0, i);
    }

    public static void main(String[] args) {
        String str[] = { "geeksforgeeks", "geeks", "geek", "geezer" };
        String res = findLongestCommonPrefix(str);
        System.out.println(res);

    }
}
