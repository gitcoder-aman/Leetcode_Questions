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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode lNode = head;
        ListNode rNode = head;
        int i = 1;
        while(i < left){
            lNode = lNode.next;
            i++;
        }
        while(left <= right){
            int j = 1;
            rNode = head;
            while(j < right){
                rNode = rNode.next;
                j++;
            }
            int rVal = rNode.val;
            rNode.val = lNode.val;
            lNode.val = rVal;
            right--;
            left++;
            lNode = lNode.next;
        }
        return head;
    }
}