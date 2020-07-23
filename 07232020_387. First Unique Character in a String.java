/*
387. First Unique Character in a String
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.
*/


/*
My WRONG Solution
*/
class Solution {
    public int firstUniqChar(String s) {
        int index = -1;
        
        for(int i=s.length()-1; i>=0; i--){
            boolean repeat = false;
            for(int j=s.length()-1; j>=0; j--){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    repeat = true;
                }
                
            }
            if(repeat == false){
                index = i;
            }
        }
        
        return index;
    }
}


/*
Optimized Solution
*/
