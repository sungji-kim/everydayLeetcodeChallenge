/*
1005. Maximize Sum Of Array After K Negations
Given an array A of integers, we must modify the array in the following way: we choose an i and replace A[i] with -A[i], and we repeat this process K times in total.  (We may choose the same index i multiple times.)

Return the largest possible sum of the array after modifying it in this way.
*/

/*My WRONG solution*/ 
class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        
        Arrays.sort(A);
        for (int num:A){
            if (num<0){ neg.add(num);}
            else{ pos.add(num);}
        }
        

            if(pos.size()==0) {
                pos.add(0);
            }
               
            if(neg.size()==0){
                neg.add(0);
            }
            

        
        
        if(neg.size() <K ){
            for(int i=0; i<K ;i++){
                int n = -1*neg.get(i);
                neg.add(n);
            }
            return sumArray(pos)+sumArray(neg);
            
            
        } else{
            K = K-neg.size();
            if(K%2==0){
                return sumArray(pos) - sumArray(neg);
            } else{
                if(pos.get(0)<neg.get(neg.size()-1)){
                     pos.add(pos.get(0)*-1);
                } else{
                    neg.add(neg.get(neg.size()-1)*-1);
                }
                return sumArray(pos) - sumArray(neg);
            }
            
        }
    }
    
    public int sumArray(ArrayList<Integer> arr){
        int sum = 0;
        for (Integer num : arr){
            sum+=num;
        }
        return sum;
    }
}




/*Other Solutions can be found here:
https://massivealgorithms.blogspot.com/2019/03/leetcode-1005-maximize-sum-of-array.html*/

        Arrays.sort(A);
        int count = 0, sum = 0, minPositive = Integer.MAX_VALUE;
        for (int num : A) {
            if (num < 0 && ++count <= K) {
                num = -num;
            }
            sum += num;
            minPositive = Math.min(minPositive, num);
        }
        if (count > K || (K - count) % 2 == 0) {
            return sum;
        } else {
            return sum - minPositive * 2;
        }
        
        
/*Comments:
I was not able to come up with an answer within 30 min limit. I tried for 1 more hour, but I couldn't make it.

The code I found online uses Arrays.sort(). Then, with the sorted Array, iterate through every element and negate it if (1) the element<0 and (2) there is a remaining K.
While iterating through an array, it keep track of an element with the Smallest Absolute Value (minPositive).
After iterating through all elements in an array,
just negate the minPositive if the remaining K is an odd number.


*/
