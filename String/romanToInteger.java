//https://leetcode.com/problems/roman-to-integer/description/

import java.util.*;
public class romanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int l = s.length();
        int res = hm.get(s.charAt(l - 1));
        for (int i = l - 2; i >= 0; i--) {
            if (hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1)))
                res -= hm.get(s.charAt(i));

            else
                res += hm.get(s.charAt(i));
        }
        return res;

    }
}
