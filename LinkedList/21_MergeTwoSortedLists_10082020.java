/**
* 21. Merge Two Sorted Lists
* Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
*/

/**
* Simplel ListNode Management. 
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode res2 = res;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                res.next = l1;
                res = res.next;
                l1 = l1.next;
            }else{ 
                res.next = l2;
                res = res.next;
                l2 = l2.next;
                    
            }
        }
        
        if(l1 == null){
            res.next = l2;
        }
        if(l2 == null){
            res.next = l1;
        }
        
        return res2.next;
        
    }
}
