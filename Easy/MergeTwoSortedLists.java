/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode lnOut = new ListNode(0); ListNode l1Pointer = l1; ListNode l2Pointer = l2; ListNode lnOutPointer = lnOut;
        
        if(l1 == null && l2 == null)
            return null;
        
        while (l1Pointer != null || l2Pointer != null) {
            int l1Val = Integer.MAX_VALUE; int l2Val = Integer.MAX_VALUE;
            if(l1Pointer != null) { l1Val = l1Pointer.val; }
            if(l2Pointer != null) { l2Val = l2Pointer.val; }
            
            if(l1Val < l2Val) {
                lnOutPointer.val = l1Val;
                if(l1Pointer != null && l1Pointer.next != null) {
                    l1Pointer = l1Pointer.next;
                    lnOutPointer.next = new ListNode(0);
                    lnOutPointer = lnOutPointer.next;
                }
                else {
                    if(l2Pointer != null) {
                        lnOutPointer.next = new ListNode(0);
                        lnOutPointer = lnOutPointer.next;
                    }
                    l1Pointer = null;
                }
            }
            else {
                lnOutPointer.val = l2Val;
                if(l2Pointer != null && l2Pointer.next != null) {
                    l2Pointer = l2Pointer.next;
                    lnOutPointer.next = new ListNode(0);
                    lnOutPointer = lnOutPointer.next;
                }
                else {
                    if(l1Pointer != null) {
                        lnOutPointer.next = new ListNode(0);
                        lnOutPointer = lnOutPointer.next;
                    }
                    l2Pointer = null;
                }
            }
        }
        return lnOut;
    }
}
