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
    public ListNode partition(ListNode head, int x) {

        if(head == null || head.next == null) return head;
        ListNode g1 = null;
        ListNode g2 = null;

        HashMap<Integer,ListNode>map = new HashMap<>();
        ListNode temp = head;
        int i = 0;
        while(temp != null){
            map.put(i++,temp);
            temp = temp.next;
        }
        ListNode headG1 = null;
        ListNode headG2 = null;

        for(Map.Entry<Integer,ListNode>entry : map.entrySet()){
            // System.out.print(entry.getKey()+""+ entry.getValue().val+" ");
            ListNode node = entry.getValue();

            if(node.val < x){
                if(g1 == null){
                    g1 = node; 
                    headG1 = g1;
                }
                else{
                    g1.next = node;
                    g1 = g1.next;
                }
            }else{
                if(g2 == null){
                    g2 = node;
                    headG2 = g2;
                }
                else{
                    g2.next = node;
                    g2 = g2.next;
                }
            }
        }
        if(g1 != null){
            g1.next = headG2;
            head = headG1;
        }else{
            head = headG2;
        }
        if(g2 != null){
            g2.next = null;
        }
        return head;
    }
}