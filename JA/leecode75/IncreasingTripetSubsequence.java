package JA.leecode75;

public class IncreasingTripetSubsequence {
    // Given an integer array nums, 
    // return true if there exists a triple of indices (i, j, k) 
    // such that i < j < k and nums[i] < nums[j] < nums[k]. 
    // If no such indices exists, return false.
    //  note: the index could be non-contiguous;
    // still use two pointer to solve the problem:
    // one to track the smallest, 
    // the other one to track the second smallest;
    // iterate through the array, and find the potential subsequence
    public boolean increasingTriplet(int[] nums) {
        // edge case
        if(nums.length<3){return false;}

        int[] greatestList = new int[nums.length];
        int greatestV = Integer.MIN_VALUE;
        for(int i = nums.length-1;i>=0;i--){
            if(greatestV < nums[i]){greatestV = nums[i];}
            greatestList[i] =greatestV;
        }
        int smallest = nums[0];
        for (int i=0;i<nums.length;i++){
            if(smallest > nums[i]){smallest =nums[i];}
            int greatest =greatestList[i];
            if(nums[i] >smallest && nums[i] < greatest){return true;}
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums ={4,5,2147483647,1,2};
        // System.out.println(nums[0]+"--"+nums[2]);
        IncreasingTripetSubsequence solution =new IncreasingTripetSubsequence();
        System.out.println(solution.increasingTriplet(nums));
    }

}
