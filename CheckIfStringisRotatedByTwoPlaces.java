
//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Strings/problem/check-if-string-is-rotated-by-two-places-1587115620

public class CheckIfStringisRotatedByTwoPlaces {

    public static boolean isRotated(String str1, String str2){
        
        if(str1.length() != str2.length()) return true;
        if(str1.length() < 2){
            return  str1.charAt(0) == str2.charAt(0);
        }
        int len = str1.length();
        String lf = str1.substring(len-2) + str1.substring(0, len-2); //onamaz
        String fl = str1.substring(2) + str1.substring(0, 2);
        // azon am
        
        return str2.equals(lf) || str2.equals(fl);
    }
    
}
