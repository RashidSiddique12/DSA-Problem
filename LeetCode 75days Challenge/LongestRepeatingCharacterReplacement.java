
//https://leetcode.com/problems/longest-repeating-character-replacement/description/?envType=study-plan&id=level-1

class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character,Integer>map=new HashMap<>();
        int start=0;
        int maxCountRepeatingCh=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            maxCountRepeatingCh=Math.max(maxCountRepeatingCh,map.get(s.charAt(i)));

            while(i-start+1-maxCountRepeatingCh>k){
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }

            maxLength=Math.max(maxLength,i-start+1);

        }
        return maxLength;
    }
}