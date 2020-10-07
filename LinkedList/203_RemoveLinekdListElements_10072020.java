/**
* 203. Remove Linked List Elements
* Remove all elements from a linked list of integers that have value val.
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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode res = new ListNode();
        ListNode res2 = res;
        while(head != null){
            if(head.val != val){
                ListNode remp = new ListNode(head.val);
                res.next = remp;
                res = res.next;   
            }
            head = head.next;
        }
        

        return res2.next;
    }
}
