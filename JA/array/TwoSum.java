package JA.array;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
//     Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
    // brute force
    public int[] twoSumBruteForce(int[] nums,int target){
        int[] res =new int[2];
        int l = nums.length;
        for(int i=0;i<l;i++){
            int a =nums[i];
            int b = target-a;
            for(int j=i+1;j<l;j++){
                if( nums[j]==b){
                    res[0]=i;
                    res[1] =j;
                }
            }
        }
        return res;
    }

    // solution 2: hashmap with O(n)
    public int[] twoSumHashMap(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< nums.length;i++){
            int complement = target- nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }

    public static void main (String[] args){
        // brute force 
        TwoSum solution = new TwoSum();
        int[] nums = {3,2,4};
        int target = 6;
        int[] res = solution.twoSumBruteForce(nums, target);
        System.out.println(Arrays.toString(res));

        // hashmap
        int[] res2 = solution.twoSumHashMap(nums, target);
        System.out.println(Arrays.toString(res2));
    }
}