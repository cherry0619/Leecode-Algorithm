package JA.array;

public class MostWater {
    // You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
    // Find two lines that together with the x-axis form a container, such that the container contains the most water.
    // Return the maximum amount of water a container can store.
    // Notice that you may not slant the container.

    // always compare the current area with the max area;
    // compare left height and right height, update the shorter one.

    // [1,1000,1000,6,2,5,4,8,3,7]
    public int solutionTwoPointer(int[] height){
        // int l = height.length;
        int maxArea =0;
        int leftIdx =0;
        int rightIdx =height.length-1;
        int curArea;
        while(leftIdx <rightIdx){
            curArea = Math.min(height[leftIdx], height[rightIdx])*(rightIdx-leftIdx);
            if (curArea>maxArea){
                maxArea =curArea;
            }
            // idx update strategy
            if (height[leftIdx] < height[rightIdx]){
                leftIdx++;
            }
            else {
                rightIdx--;
            }
        }
        return maxArea;
    }
    
    public static void main(String[] agrs){
        int[] height = new int[]{10,9,8,7,6,5,4,3,2,1};
        MostWater solution = new MostWater();
        System.out.println(solution.solutionTwoPointer(height));
    }


}
