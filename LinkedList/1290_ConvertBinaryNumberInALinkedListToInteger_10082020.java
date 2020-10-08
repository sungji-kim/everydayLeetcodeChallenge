/**
* 1290. Convert Binary Number in a Linked List to Integer
* Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.
*/

/**
* With this problem, we can learn bit manipulation. 
| OR
& AND
^ XOR
~ NOT
<< shift to left (multiply by two)
>> shift to right (divide by two)
*/

/**
* bit manipulation
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int res = head.val;
        
        while(head.next != null){
            res = (res << 1) | head.next.val;
            head = head.next;
        }
        
        return res;
      
    }
}

/**
* Binary Representation
*/
class Solution {
    public int getDecimalValue(ListNode head) {
        int res = head.val;
        
        while(head.next != null){
            res = res*2 + head.next.val;
            head = head.next;
        }
        
        return res;
      
    }
}

