package JA.Recursion;


public class EliminationGame {
    public int lastRemaining(int n) {
        return lastRemainingHelper(1, n,1, true);
    }

    private int lastRemainingHelper(int head,int remaining, int step, boolean leftToRight) {
        // base case 
        if(remaining ==1){return head;}
        // update variables for the recursion
        if(leftToRight || remaining %2==1){head +=step;}
        return lastRemainingHelper(head, remaining/2, step*2, !leftToRight);
    }


    public int lastRemainningMath(int n){
        int head =1;
        boolean leftToRight =true;
        int step =1;
        int remaining =n;
        while(remaining >1){
            // if start from left or the remaining is odd( start from right while with odd length)
            if(leftToRight || remaining%2 ==1){
                head +=step;
            }
            remaining = remaining /2;
            step *=2;
            leftToRight =!leftToRight;
        }
        return head;
    }



    public static void main(String[] args) {
        EliminationGame solution = new EliminationGame();
        int res = solution.lastRemainningMath(9);
        int resRecursion =solution.lastRemaining(9);
        System.out.println(resRecursion); // Output: 6
    }
}
