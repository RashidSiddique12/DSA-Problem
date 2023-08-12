import java.util.*;

public class SmallestwindowinaStringcontainingallcharacters {

    public static String smallestWindow(String s, String p) {
        if (p.length() > s.length())
            return "-1";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
        }

        int i = 0, j = 0;
        String ans = "-1";
        int count = map.size();
        int min = Integer.MAX_VALUE;
        while (j < s.length()) {

            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                if (map.get(s.charAt(j)) == 0) {
                    count--;
                }
            }
            while (count == 0) {

                if (j - i + 1 < min) {
                    ans = s.substring(i, j + 1);
                    min = j - i + 1;
                }

                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

                    if (map.get(s.charAt(i)) > 0) {
                        count++;
                    }
                }
                i++;
            }
            j++;

        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "zoomlazapzo";
        String p = "oza";
        String res = smallestWindow(s, p);

        System.out.println(res);
    }
}
