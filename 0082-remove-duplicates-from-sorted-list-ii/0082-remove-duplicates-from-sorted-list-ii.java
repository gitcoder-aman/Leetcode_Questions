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
        
        if(head == null || head.next == null) return head;
        // HashMap<Integer,Integer>map = new HashMap<>();
        
        // ListNode curr = head;

        // while(curr != null){
        //     map.put(curr.val, map.getOrDefault(curr.val, 0) + 1);
        //     curr = curr.next;
        // }
        // ListNode dummy = new ListNode(0);
        // ListNode tail = dummy;
        // curr = head;

        // while(curr != null){
        //     if(map.get(curr.val) == 1){
        //         tail.next = curr;
        //         tail = tail.next;
        //     }
        //     curr = curr.next;
        // }
        // tail.next = null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode curr = head;
        ListNode prev = dummy;
        while(curr != null){
            if(curr.next != null && curr.val == curr.next.val){

                //skip all node with the same values
                while(curr.next != null && curr.val == curr.next.val){
                    curr = curr.next;
                }
                //skip the last duplicate as well
                curr = curr.next;
                prev.next = curr;
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}