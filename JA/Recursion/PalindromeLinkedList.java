package JA.Recursion;

class PalindromeLinkedList {
    
    // split the list into two halfs
    // reverse the second half list
    // compare the first half and second half
    public boolean isPalindrome(ListNode head){
        ListNode preMid =findPreMidNode(head);
        ListNode head2 = reverListNode(preMid.next);
        while(head !=null &&  head2 !=null){
            if (head.val != head2.val){return false;}
            head =head.next;
            head2 =head2.next;
        }
        return true;
    }

    // step one: find the previous node before middle node
    public ListNode findPreMidNode(ListNode head){
        ListNode slow = head;
        ListNode fast =head.next;
        while(fast !=null && fast.next !=null){
            slow =slow.next;
            fast =fast.next.next;
        }
        return slow;
    }

    // step two :reverse the second half listNode
    // this time we use recursion
    public ListNode reverListNode(ListNode head){
        if(head == null || head.next ==null){return head;}
        ListNode newHead = reverListNode(head.next);
        newHead.next.next =head;
        head.next =null;
        return newHead;
    }
}