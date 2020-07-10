/*

Description: Given an integer array arr. You have to sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
Return the sorted array.

*/

/*

<My Solution>
Runtime: 79 ms, faster than 5.77% of Java online submissions for Sort Integers by The Number of 1 Bits.
Memory Usage: 52.5 MB, less than 5.09% of Java online submissions for Sort Integers by The Number of 1 Bits.

*/

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] arr2 = new Integer[arr.length];
        for (int i=0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        
        Arrays.sort(arr2, new BitComparator());
        
        for (int i=0; i<arr.length; i++){
            arr[i] = arr2[i];
        }
        
        return arr;
            
        
    }
}

class BitComparator implements Comparator<Integer>{
    public int compare(Integer a1, Integer a2){
        int a1_num1 = numOne(a1);
        int a2_num1 = numOne(a2);
        
        if(a1_num1<a2_num1){
            return -1;
        }else if (a1_num1>a2_num1){
            return 1;
        } else{
            if(a1<a2){
                return -1;
            } else if (a1>a2){
                return 1;
            } else{
                return 0;
            }
        }
            
    }
    
    public int numOne(Integer i){
        int numOne=0;
        
        while(i>0){
            if(i%2!=0){
                numOne++;
            }
            
            i=i/2;
        }
        
        return numOne;
        
    }
}
