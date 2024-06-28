package JA.leecode75;

public class ContainerWithMostWater {
    // Input: height = [1,8,6,2,5,4,8,3,7]
    // Output: 49
    // Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
    // Notice that you may not slant the container.

    //  two pointer start and end
    public int maxArea(int[] height) {
        int n = height.length;
        int areaMax = 0;
        int leftIdx=0;
        int rightIdx = n-1;
        while(leftIdx < rightIdx){
            int h = Math.min(height[leftIdx], height[rightIdx]);
            int s =h*(rightIdx-leftIdx);
            if (s>areaMax){areaMax =s;}
            // move the pointer
            if(height[leftIdx] < height[rightIdx]){
                leftIdx++;
            }else{
                rightIdx--;
            }
        }
        return areaMax;
    }

    public static void main(String[] args) {
        int[] height ={1,8};
        ContainerWithMostWater solution = new ContainerWithMostWater();
        System.out.println(solution.maxArea(height));
    }

}
