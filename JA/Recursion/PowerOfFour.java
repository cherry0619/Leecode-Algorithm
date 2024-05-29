package JA.Recursion;

public class PowerOfFour {
// Given an integer n, return true if it is a power of four. Otherwise, return false.

// An integer n is a power of four, if there exists an integer x such that n == 4x.

// Example 1:

// Input: n = 16
// Output: true
// Example 2:

// Input: n = 5
// Output: false
// Example 3:

// Input: n = 1
// Output: true
 
public boolean isPowerOfFour(int n){
    // base case n<=4
    if (n==1){return true;}
    if(n<4 || n%4 !=0){return false;}
    else {
        return isPowerOfFour(n/4);
    }
}

public static void main(String[] args){
    // int a =5;
    // System.out.println(4/4);
    PowerOfFour a = new PowerOfFour();
    System.out.println(a.isPowerOfFour(5));
}

}
