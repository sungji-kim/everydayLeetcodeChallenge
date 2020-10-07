/**
* 234. Palindrome Linked List
* Given a singly linked list, determine if it is a palindrome.
*/

/*
* With this problem, we can learn how to reverse Linked List, and fast&slow pointers algorithm. 
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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode rev = reverse(slow);
        fast = head;
        while(rev != null){
            if(fast.val != rev.val) return false;
            fast = fast.next;
            rev = rev.next;
        }
        
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        
        
        return prev;
    }
}
