package JA.Recursion;

public class PowerOfThree {
    // Given an integer n, return true if it is a power of three. Otherwise, return false.
    // An integer n is a power of three, if there exists an integer x such that n == 3x.
    // Example 1:
    // Input: n = 27
    // Output: true
    // Explanation: 27 = 33
    // Example 2:
    // Input: n = 0
    // Output: false
    // Explanation: There is no x where 3x = 0.
    // Example 3:
    // Input: n = -1
    // Output: false
    // Explanation: There is no x where 3x = (-1).

    public boolean isPowerOfThree(int n){
        // base case
        if(n==1){
            return true;
        }
        if (n<3 || n%3 !=0){
            return false;
        }
        return isPowerOfThree(n/3);
    }

    public static void main(String[] args){
        PowerOfThree s = new PowerOfThree();
        System.out.println(s.isPowerOfThree(0));
    }

}
