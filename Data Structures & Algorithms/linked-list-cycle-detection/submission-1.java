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
    public boolean hasCycle(ListNode head) {
        ListNode fast,slow;
        boolean res = false;
        slow = null;
        fast = null;

        if(head.next != null)slow = head.next;
        if(slow != null) fast = head.next.next;

        while(slow != null && fast != null){
            if(slow == fast){
                res = true;
                break;
            }
            slow = slow.next;
            if(fast.next != null){
                fast = fast.next.next;
            }else{
                fast = null;
            }
            
        }

        

        return res;

    
        
    }
}
