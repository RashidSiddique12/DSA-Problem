
//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Hashing/problem/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621

public class winnerOfElection {
    
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<n; i++){
            if(map.get(arr[i]) ==null){
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
        int max =1 ;
        String ans ="";
        
        for(int i=n-1; i>=0; i--){
            if(map.get(arr[i]) >= max){
                max = Math.max(max, map.get(arr[i]));
                ans = arr[i];
            }
        }
        String res[] = new String[2];
        res[0] = ans;
        res[1] = Integer.toString(max);
        return res;
        
       
    }
}
