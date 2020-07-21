/*
83. Remove Duplicates from Sorted List
Description: Given a sorted linked list, delete all duplicates such that each element appear only once.
*/

/*
My Solution
untime: 1 ms, faster than 39.53% of Java online submissions for Remove Duplicates from Sorted List.
Memory Usage: 41.8 MB, less than 5.03% of Java online submissions for Remove Duplicates from Sorted List.
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode head2 = head;
        if(head == null){
            return null;
        }

        
        while(head !=null && head.next !=null && head.next.next !=null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }
            if(head.val != head.next.val){
                head = head.next;
            }
            
            
              
        }
        if(head.next !=null){
            if(head.val == head.next.val){
                head.next = null;
            }
        } 
        
        
        return head2;

        
        
    }
}
/*Optimized Solution from Leetcode*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        
		ListNode rtn = head;

		ListNode temp = head;

		while (temp != null) {

			while (temp.next != null && temp.next.val == temp.val) {

				temp.next = temp.next.next;

			}

			temp = temp.next;
		}

		return rtn;
    }
}

/*
Comments: I practiced linked-list node. My solution and solution from leetcode has similar runtime, but leetcode version is simpler than my solution. It took 45 minutes to solve the question.
*/
