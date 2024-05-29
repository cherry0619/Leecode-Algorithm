package JA.Recursion;


public class MergeTwoSortList {
    // let's try iteration first
    public ListNode mergeTwoListsIteration(ListNode list1, ListNode list2) {
        ListNode dummNode =new ListNode();
        ListNode tail = dummNode;
        // edge case
        if (list1==null){return list2;}
        if (list2==null){return list1;}
        while(list1 !=null && list2 !=null){
            if(list1.val <list2.val){
                tail.next = list1;
                list1 =list1.next;
            }
            else{
                tail.next = list2;
                list2 =list2.next;
            }
            tail =tail.next;
        }
        // after the loop, check the remaining elements in each link
        if(list1 !=null){tail.next = list1;}
        if(list2 !=null){tail.next =list2;}
        return dummNode.next;
        
    }


    public ListNode mergeTwoListRecursive(ListNode list1, ListNode list2){
        // base case 
        if (list1 ==null){return list2;}
        if(list2 ==null){return list1;}
        
        // recursive
        if(list1.val < list2.val){
            list1.next = mergeTwoListRecursive(list1.next, list2);
            return list1;
        }else{
            list2.next =mergeTwoListRecursive(list1, list2.next);
            return list2;
        }
    }

}

