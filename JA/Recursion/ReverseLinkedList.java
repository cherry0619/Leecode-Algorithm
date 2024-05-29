package JA.Recursion;

public class ReverseLinkedList {
    // Given the head of a singly linked list, reverse the list, and return the reversed list.
    public ListNode reverseListIteration(ListNode head) {
       ListNode prev =null;
       ListNode next =null;
       ListNode currNode = head;
       while (currNode !=null){
        next = currNode.next;
        currNode.next = prev;
        prev = currNode;
        currNode =next;
       }
       return prev;
    }


    public ListNode reverseListRecursion(ListNode head){
        if(head ==null || head.next ==null){return head;}
        ListNode newNode = reverseListRecursion(head.next);

        head.next.next = head;
        head.next =null;
        return newNode;
    }


}
