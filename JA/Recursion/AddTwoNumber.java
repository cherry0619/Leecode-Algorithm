package JA.Recursion;

class AddTwoNumber {
    // solution 1: iteration
    public ListNode addTwoNumbersIteration(ListNode l1, ListNode l2) {
        ListNode newHead =new ListNode(-1);
        ListNode p = newHead;
        int carry =0;
        while (l1 !=null || l2 !=null){
            int num1 = l1 !=null ?l1.val :0;
            int num2 = l2 !=null ? l2.val:0;
            int sum = num1 +num2 +carry;
            p.next =new ListNode(sum%10);
            carry = sum /10;
            p= p.next;
            // move forward
            if (l1 !=null){l1 =l1.next;}
            if(l2 !=null){l2 =l2.next;}
        }
        // check carry 
        if(carry >0){p.next = new ListNode(carry);}
        return  newHead.next;
    }

    // solution 2: recursion
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        return addTwoNumbersHelper(l1, l2, 0);
    }



    public ListNode addTwoNumbersHelper(ListNode l1, ListNode l2,int carry){
        // base case
        if (l1 ==null && l2 ==null && carry ==0){return null;}
        int sum =carry;
        if (l1 !=null){
            sum +=l1.val;
            l1 =l1.next;}
        if(l2 !=null){
            sum +=l2.val;
            l2 =l2.next;
        }
        ListNode newHead = new ListNode(sum%10);
        carry =sum/10;
        newHead.next = addTwoNumbersHelper(l1, l2, carry);
        return newHead;
    }

}