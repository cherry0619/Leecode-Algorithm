package JA.leecode75;

public class MaxConsecutiveOne {
    // One thing's for sure, we will only flip a zero if it extends an existing window of 1s.
    //  Otherwise, there's no point in doing it, right? 
    // Think Sliding Window!

    // hint 2 
    // Since we know this problem can be solved using the sliding window construct,
    //  we might as well focus in that direction for hints. 
    // Basically, in a given window, we can never have > K zeros, right?

    // Constraints:
    // 1 <= nums.length <= 105
    // nums[i] is either 0 or 1.
    // 0 <= k <= nums.length

    // 1,1,1,0,0,0,1,1,1,1,0
    public int longestOnes(int[] nums, int k) {
        int longest = 0;
        int n =nums.length;
        int startIdx =0;
        int endIdx =0;
        int zeroNums =nums[0] ==0?1:0;
        while(endIdx < n){
            // hint 2
            if((zeroNums<=k) || (endIdx-startIdx <k)){
                longest = ((endIdx+1-startIdx)>longest)? (endIdx+1-startIdx):longest;
                endIdx++;
                if (endIdx ==n){break;}
                zeroNums +=nums[endIdx]==0?1:0;
            }else{
                zeroNums -= nums[startIdx]==0?1:0;
                startIdx++;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums ={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        MaxConsecutiveOne solution = new MaxConsecutiveOne();
        System.out.println(solution.longestOnes(nums, k));
    }

}
