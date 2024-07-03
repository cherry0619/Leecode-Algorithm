package JA.leecode75;

public class LongestSubarrayAfterDeleleOneElement {
    // Example 1:
    // Input: nums = [1,1,0,1]
    // Output: 3
    // Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
    // Example 2:
    // Input: nums = [0,1,1,1,0,1,1,0,1]
    // Output: 5
    // Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
    // Example 3:
    // Input: nums = [1,1,1]
    // Output: 2
    // Explanation: You must delete one element.
    
    // Constraints:
    // 1 <= nums.length <= 105
    // nums[i] is either 0 or 1.

    //  try slide window first
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        //  edge case
        if(n==1){return 0;}
        int startIdx = 0;
        int endIdx =0;
        int longestLen = 0;
        int length =0;
        int zeroNums =0;
        boolean zeorFlag = false;
        while(endIdx < n){
            if (nums[endIdx]==0){zeroNums++;zeorFlag =true;}
            if (nums[endIdx] !=0 || zeroNums<2){
                length = length + nums[endIdx];
            }
            if(zeroNums>1){
                length = length -nums[startIdx];
                zeroNums = (nums[startIdx]==1)?zeroNums:zeroNums-1;
                startIdx++;
            }
            endIdx++;
            longestLen = (length> longestLen)? length:longestLen;
        }
        longestLen =zeorFlag==true? longestLen:longestLen-1;
        return longestLen;
    }

    public static void main(String[] args) {
        int[] nums ={1,1,1,1,1,1,1,1};
        LongestSubarrayAfterDeleleOneElement solution  = new LongestSubarrayAfterDeleleOneElement();
        System.out.println(solution.longestSubarray(nums));
    }
}
