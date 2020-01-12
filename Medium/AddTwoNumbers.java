/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Declare listNodes
        ListNode lnOut = new ListNode(0); ListNode lnPoint = lnOut; ListNode l1Point = l1; ListNode l2Point = l2;
        
        //Declare carry to identify if there will be a carry over
        boolean carry = false;
        while(l1Point != null || l2Point != null) {
            //Declare l1 and l2 values
            int l1Val = 0; int l2Val = 0;
            if(l1Point != null) { l1Val = l1Point.val; }
            if(l2Point != null) { l2Val = l2Point.val; }
            
            //Add l1 and l2 values, add 1 if ever there is a carry over
            int sum = l1Val + l2Val;
            if(carry) { sum++; }
            
            //Identify if there is a carry over
            lnPoint.val = sum % 10;
            if (sum / 10 > 0)
                carry = true;
            else 
                carry = false;
            
            //Move the pointers for l1 and l2
            if(l1Point != null && l1Point.next != null)
                l1Point = l1Point.next;
            else
                l1Point = null;
            if(l2Point != null && l2Point.next != null)
                l2Point = l2Point.next;
            else
                l2Point = null;
            
            //Check if l1 and l2 pointers are not null, else if carry is true, add a next ListNode with value 1
            if(l1Point != null || l2Point != null) {
                lnPoint.next = new ListNode(0);
                lnPoint = lnPoint.next;
            }
            else if (carry)
                lnPoint.next = new ListNode(1);
        }
        
        return lnOut;
    }
    
    //Code below did not work as it cannot handle the bit size test case
    /*
    public ListNodeTest1 addTwoNumbers(ListNode l1, ListNode l2) {
        long val1 = getVal(l1); long val2 = getVal(l2);
        long total = val1+val2;
        ListNode ln = getVal((int)total);
        return ln;
    }
    //returns the true value of a listNode
    public long getVal(ListNode l) {
        long total = 0;
        int exp = 0;
        while(l != null) {
            total += l.val * Math.pow(10,exp);
            l = l.next;
            exp++;
        }
        return total;
    }
    //returns the ListNode in reverse of a value
    public ListNode getVal(long val) {
        ListNode lnOut = new ListNode ((int)(val%10));
        ListNode lnPoint = lnOut;
        while (val != 0) {
            lnPoint.val = (int)(val%10);
            if(val < 10) {
                val = 0;
                break;
            }
            val/=10;
            lnPoint.next = new ListNode ((int)(val%10));
            lnPoint = lnPoint.next;
        }
        return lnOut;
    }
    */
}
