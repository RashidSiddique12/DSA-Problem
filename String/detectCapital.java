//https://leetcode.com/problems/detect-capital/description/



public class detectCapital {
    

    public boolean detectCapitalUse(String word) {
        if(word.length() < 2) return true;

        if(Character.isUpperCase(word.charAt(0))){
            boolean isFirst = Character.isUpperCase(word.charAt(1));
            for(int i=2; i<word.length(); i++){
                boolean rest = Character.isUpperCase(word.charAt(i));
                if(isFirst != rest) return false;
                
            }
            return true;

        }
        else{
            for(int i=1; i<word.length(); i++){
                if(Character.isUpperCase(word.charAt(i))) return false;
            }
            return true;
        }
    
    // //2nd Method
    // int n = word.length();
    // String first = word.substring(0, 1);
    // String rest = word.substring(1, n);

    
    // if(word == word.toUpperCase()) return true;
    // if(word == word.toLowerCase()) return true;
    // if(first == first.toUpperCase() && rest == rest.toLowerCase()) return true;

    // return false;

        
        
    }
}