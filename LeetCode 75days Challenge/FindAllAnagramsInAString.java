//https://leetcode.com/problems/find-all-anagrams-in-a-string/description/?envType=study-plan&id=level-1

class Solution {

    // public static boolean compare( HashMap <Character, Integer> sou,  HashMap <Character, Integer> pat){
    //     for(char sc : sou.keySet()){
    //         if(pat.getOrDefault(sc,0) != sou.get(sc)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        if(p.length() > s.length()) return list;

        HashMap <Character, Integer> pat = new HashMap<>();
        HashMap <Character, Integer> sou = new HashMap<>();

        for(int i=0; i<p.length(); i++){
            char ch = p.charAt(i);
            pat.put(ch, pat.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<p.length(); i++){
            char ch = s.charAt(i);
            sou.put(ch, sou.getOrDefault(ch,0)+1);
        }

        int i=p.length();
        int j = 0;
        while(i < s.length()){
            if(sou.equals(pat) == true){
                list.add(j);
            }

            char ch = s.charAt(i);
                sou.put(ch, sou.getOrDefault(ch, 0) + 1);
        
            char chr = s.charAt(j);
            if(sou.get(chr) == 1){
                sou.remove(chr);
        }
            else{
                sou.put(chr, sou.get(chr)-1);
        }

            i++;
            j++;
        }
         if(sou.equals(pat) == true){
                list.add(j);
            }
        
        return list;
    }
}