/*
387. First Unique Character in a String
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.
*/


/*
My Solution
Runtime: 67 ms, faster than 7.05% of Java online submissions for First Unique Character in a String.
Memory Usage: 45.7 MB, less than 5.01% of Java online submissions for First Unique Character in a String.
*/
class Solution {
    public int firstUniqChar(String s) {
    
        // character, index
        Map <Character, Integer> hm = new HashMap<>();
        // character, occurrence
        Map <Character, Integer> hm2 = new HashMap<>();
        
    
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!hm.containsKey(c) && !hm2.containsKey(c)){
                hm.put(c,i);
            } else{
                hm.remove(c);
                hm2.put(c,0);
            }
            
        }
        
        if(!hm.isEmpty()){
            ArrayList<Integer> newList = new ArrayList<>(hm.values());
            Collections.sort(newList);
            return newList.get(0);
            
        } else{
            return -1;
        }
        
        
    }
}


/*
Optimized Solution
*/
