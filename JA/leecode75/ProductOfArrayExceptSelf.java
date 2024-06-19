package JA.leecode75;

public class ProductOfArrayExceptSelf {
    // Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    // The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    // You must write an algorithm that runs in O(n) time and without using the division operation.
    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //  HINTS: Think how you can efficiently utilize prefix and suffix 
    // products to calculate the product of all elements 
    // except self for each index. 
    // Can you pre-compute the prefix and suffix products 
    // in linear time to avoid redundant calculations?

    // step 1: calculate the preffix product of each element
    private int[] productPreffix(int[] nums){
        int[] preffixProduct = new int[nums.length];
        preffixProduct[0] =1;
        for(int i=1;i<nums.length;i++){
            preffixProduct[i] = preffixProduct[i-1]*nums[i-1];
        }
        return preffixProduct;
    }

    // step2: calculate the suffix product of each element
    private int[] productSuffix(int[] nums){
        int[] suffixProduct = new int[nums.length];
        suffixProduct[nums.length-1] =1;
        for(int i = nums.length-2;i>=0;i--){
            suffixProduct[i] =nums[i+1]*suffixProduct[i+1];
        }
        return suffixProduct;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] preffix = productPreffix(nums);
        int[] suffix = productSuffix(nums);
        int[] res = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            res[i] =preffix[i]*suffix[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums ={-1,1,0,-3,3};
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] res = solution.productExceptSelf(nums);
        for(int i:res){
            System.out.println(i);
        }

    }
}
