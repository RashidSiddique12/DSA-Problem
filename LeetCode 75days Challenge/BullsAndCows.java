
//https://leetcode.com/problems/bulls-and-cows/description/?envType=study-plan&id=level-1


class Solution {
    public String getHint(String secret, String guess) {
        
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> gmap = new HashMap<>();
        int bull=0, cow=0;

        for(int i=0; i<secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s == g ) bull++;
            else{
                smap.put(s, smap.getOrDefault(s, 0)+1);
                gmap.put(g, gmap.getOrDefault(g, 0)+1);
            }
        }
        for(char e : smap.keySet()){
            if(gmap.containsKey(e)){
                cow += Math.min(smap.get(e), gmap.get(e));
            }
        }
        String  s = bull + "A" + cow + "B";
        return s;
    }
}