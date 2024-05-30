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

package  JA.Recursion;

class reorderList {
    // step 1: find the mid node
    // use slow and fast pointer
    public ListNode findMidPrev(ListNode head){
        // base case 
        if(head ==null || head.next ==null){return head;}
        // slow and fast pointer
        ListNode slow = head;
        ListNode fast = head;
        while( fast.next != null && fast.next.next !=null){
            slow =slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // step 2: reverse the second half node;
    public ListNode reverse(ListNode head){
        // base case 
        if(head ==null || head.next ==null){return head;}
        ListNode newHead =reverse(head.next);
        head.next.next =head;
        head.next =null;
        return newHead;
    }

    // step 3: reorder the first and second half lists;
    public void reorderList(ListNode head) {
        if(head ==null || head.next ==null){return ;}
        ListNode midNodePre = findMidPrev(head);
        ListNode head2 = reverse(midNodePre);
        while(head !=null && head2 !=null ){
            System.out.println(head2.val);
            ListNode leftNext = head.next;
            ListNode rightNext = head2.next;
            head.next =head2;
            head2.next =leftNext;
            head =leftNext;
            head2 =rightNext;            
        }
        if (head == midNodePre && head2 ==null){head.next= midNodePre;}
    }
}