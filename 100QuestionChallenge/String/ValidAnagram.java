class ValidAnagram {

    public static boolean check(String s, String t) {
        if (s.length() != t.length())
            return false;

        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {

            char ch_s = s.charAt(i);
            arr[ch_s - 'a']++;

            char ch_t = t.charAt(i);
            arr[ch_t - 'a']--;

        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean res = check(s, t);
        System.out.println(res);
    }
}