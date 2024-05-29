package JA.Recursion;

class RemoveLinkedListElement {
    public ListNode removeElementsIteration(ListNode head, int val) {
        // create a dummy node
        ListNode dummNode = new ListNode();
        ListNode tail =dummNode;
        while(head !=null){
            if(head.val !=val){
                tail.next =head;
                tail =tail.next;
            }
            head =head.next;
        }
        tail.next =null;
        return dummNode.next;
    }

    public ListNode removeElementsRecursion(ListNode head, int val) {
        // base case
        if (head ==null){return null;}
        
        //  recursively iterate the linked list
        head.next = removeElementsRecursion(head.next, val);
        if (head.val ==val){
            return head.next;
        }else{
            return head;}
        
    }
 

}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
};