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
Optimized Solution From LeetCode
*/
class Solution {
    public int firstUniqChar(String s) {
        char[] letters = s.toCharArray();
        int[] stat = new int[26];
        for(int i = 0; i < letters.length; i ++) {
                stat[letters[i] - 'a'] ++;
        }
        for(int i = 0; i < letters.length; i ++) {
            if(stat[letters[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}

/*Comment: I used HashMap in order to track the occurrence of a letter, because HashMap's time complexity is constant. However, it turned out to be really slow.
The optimized solution from leetcode only uses char array to store occurrence of a letter. Later, if the occurrence ==1, print the index. */
