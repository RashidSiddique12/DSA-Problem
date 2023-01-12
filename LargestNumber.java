//https://leetcode.com/problems/largest-number/description/

public class LargestNumber {
    public String largestNumber(int[] nums) {
        //int - String
        String []arr = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i] + "";
        }

        //sorting acc comparator
        Arrays.sort(arr,(a,b)->{
            long n1 = Long.parseLong(a+b);
            long n2 = Long.parseLong(b+a);
            if(n1 > n2) return 1;
            else if(n1 < n2) return -1;
            else return 0;
        });

        StringBuilder sb = new StringBuilder("");
        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]); 
            if(sb.charAt(0)== '0') return "0";
        }
        return sb.toString();



    }
}
