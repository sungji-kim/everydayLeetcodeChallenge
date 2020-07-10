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









/*

Optimized Solution from LeetCode

*/
class Solution {
    
    public int numOfOns(int n){
        int sum=0;
        while(n!=0){
            sum+=n&1;
            n=n>>1;
        }
        return sum;
    }
    public int[] sortByBits(int[] arr) {
        
        Arrays.sort(arr);
        int x=0;
        int []res=new int [arr.length];
        for(int i=0;i<14;i++)
        {
            // j=0;
            for( int j=0;j<arr.length;j++){
                if(numOfOns(arr[j])==i){
                    res[x]=arr[j];x++;
                }
            }
            if(x==arr.length)break;
        }
        return res;
    }
}


/*
Comments:
I used Comparator<Integer> to sort an array, but the optimized solution didn't use comparator. 
Rather, it first sorted an array (Arrays.sort(int[])), and for each possible numOne ([0,14)), check if an element's numOne is equal to the possible numOne (see code 100 - 109).
This way, even though it was double for loop, was much faster than using comparator.
However, it was pleasant experience to practice comparator using this leetcode problem!
Happy coding!
*/
