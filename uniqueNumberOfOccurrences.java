
//https://leetcode.com/problems/unique-number-of-occurrences/description/
import java.util.*;


public class uniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+ 1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }
        Set <Integer> hs = new HashSet<>();
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            hs.add(e.getValue());
          }

          return (hm.size()== hs.size());
        
    }
}