package JA.leecode75;

public class FindPivotPoint {

    // Example 1:
    // Input: nums = [1,7,3,6,5,6]
    // Output: 3
    // Explanation:
    // The pivot index is 3.
    // Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
    // Right sum = nums[4] + nums[5] = 5 + 6 = 11
    // Example 2:

    // Input: nums = [1,2,3]
    // Output: -1
    // Explanation:
    // There is no index that satisfies the conditions in the problem statement.
    // Example 3:

    // Input: nums = [2,1,-1]
    // Output: 0
    // Explanation:
    // The pivot index is 0.
    // Left sum = 0 (no elements to the left of index 0)
    // Right sum = nums[1] + nums[2] = 1 + -1 = 0

    // constraints
    // 1 <= nums.length <= 104
    // -1000 <= nums[i] <= 1000    
    // calculate the total nums, and deducte the item with each iteration;
    public int pivotIndex(int[] nums) {
        // first loop
        int totalSum =0;
        for(int num:nums){
            totalSum += num;
        }
        int preffixSum = 0;
        for(int i =0;i<nums.length;i++){
            preffixSum += (i ==0)?0:nums[i-1];
            int gap = totalSum-nums[i];
            if( gap==2*preffixSum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindPivotPoint solution = new FindPivotPoint();
        int[] nums ={1,2,3};
        System.out.println(solution.pivotIndex(nums));
    }
}
