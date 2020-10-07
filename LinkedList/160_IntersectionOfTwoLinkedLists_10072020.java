/**
* 160. Intersection of Two Linked Lists.
* Write a program to find the node at which the intersection of two singly linked lists begins.
*/

/*
* There are three ways to solve this problem. 
First, use HashTable. Traverse one Linked List (headA), and save each node in the Hash Table.  
Second, use Linked List Cycle method. Use two pointers. Traverse both list. If A reaches its end, redirect it to the head of B, and vise versa. 
If two pointers meets each other, that's the intersection. 
Third, use length of Linked List. Find length of both list. In order to make the number of nodes before the intersection same, traverse longer list for diff(lenA, lenB). 
Next, traverse both list. If they meet each other, that's the intersection. 
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 /*
 * First method.
 */
 public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> hs = new HashSet<>();
        
        while(headA!=null){
            hs.add(headA);
            headA = headA.next;
        }
        
        while(headB!=null){
            if(hs.contains(headB)){
                return headB;
            }
            headB = headB.next;
            
        }
        return null;
        
    }
}
/*
* Second method. 
*/
 
 
 /*
 * Third method.
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        while(headA != null){
            headA = headA.next;
            lenA++;
        }
        while(headB != null){
            headB = headB.next;
            lenB++;
        }
        
        headA = tempA;
        headB = tempB;
        
        if(lenA>lenB){
            int diff = lenA-lenB;
            for(int i=0; i<diff; i++){
                headA = headA.next;
            }
            
        }else{
            int diff = lenB-lenA;
            for(int i=0; i<diff; i++){
                headB = headB.next;
            }
            
        }
        
        while(headA != null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        
        return null;
        
    }
}
