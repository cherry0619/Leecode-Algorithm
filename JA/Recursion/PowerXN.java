package JA.Recursion;

public class PowerXN {
    // Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
    //     Example 1:

    // Input: x = 2.00000, n = 10
    // Output: 1024.00000

    //     Example 2:
    // Input: x = 2.10000, n = 3
    // Output: 9.26100

    // Example 3:
    // Input: x = 2.00000, n = -2
    // Output: 0.25000
    // Explanation: 2-2 = 1/22 = 1/4 = 0.25

    // running out of time
    public double myPowIteration(double x, int n){
        double a = n>0?x:1/x;
        int power = n>0? n:-n;
        double res =1;
        for(int i =1; i<=power;i++){
            res *=a;
        }
        return res;
    }

    public double myPowRecursion(double x, int n){
        double a = n>0?x:1/x;
        int power = n>0? n:-n;
        return myPowRecursionHelper(a, power);
    }


    public double myPowRecursionHelper(double x, int n){
        // if (n==1){return x;}
        // n=n-1;
        // return x*myPowRecursionHelper(x, n);
        // just iterate one half n
        if(n==0){return 1;}
        double half = myPowRecursionHelper(x, n/2);
        if(n%2==0){return half* half;}
        else {return half* half *x;}
    }

}
