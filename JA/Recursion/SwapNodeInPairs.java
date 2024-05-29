package JA.Recursion;

public class SwapNodeInPairs {
    
    public ListNode swapPairs(ListNode head){
        // base case 
        if(head ==null || head.next ==null){return head;}
        // two pointer slow and fast
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(head !=null && head.next.next !=null){
            ListNode slow =head;
            ListNode fast = head.next;
            cur.next = fast;
            cur.next.next =slow;
            cur = cur.next;
            head =head.next.next;

        }
        
        return dummy.next;
    }
}
