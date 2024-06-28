package JA.leecode75;

class MaximumAverageSubarray {
    
    // Find a contiguous subarray whose length is equal to k 
    // that has the maximum average value and return this value. 
    // Any answer with a calculation error less than 10-5 will be accepted.
    
    // Example 1:
    // Input: nums = [1,12,-5,-6,50,3], k = 4
    // Output: 12.75000
    // Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
    
    // Example 2:
    // Input: nums = [5], k = 1
    // Output: 5.00000

    // n == nums.length
    // 1 <= k <= n <= 105
    // -104 <= nums[i] <= 104
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        // init the window and get the avg and sum;
        int sum =0;
        for (int i =0;i<k;i++){
            sum +=nums[i];
        }
        int maxSum =sum;

        //  slide the window
        for(int j =k;j<n;j++){
            sum = sum + nums[j]-nums[j-k];
            maxSum =(sum >maxSum)?sum:maxSum;
        }

        double avg = (double) maxSum /k;
        return avg;
    }

    public static void main(String[] args) {
        int[] nums ={5};
        int k = 1;
        MaximumAverageSubarray solution = new MaximumAverageSubarray();
        System.out.println(solution.findMaxAverage(nums, k));
    }


}
