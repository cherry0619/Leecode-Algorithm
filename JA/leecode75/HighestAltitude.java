package JA.leecode75;

public class HighestAltitude {
    // Example 1:
    // Input: gain = [-5,1,5,0,-7]
    // Output: 1
    // Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
    // Example 2:

    // Input: gain = [-4,-3,-2,-1,4,3,2]
    // Output: 0
    // Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.

    // Constraints:
    // n == gain.length
    // 1 <= n <= 100
    // -100 <= gain[i] <= 100
    public int largestAltitude(int[] gain) {
        int currentAltitude =0;
        int highestAltitude =0;
        int n = gain.length;
        for(int i =0;i<n;i++){
            currentAltitude +=gain[i];
            highestAltitude = (currentAltitude > highestAltitude)? currentAltitude: highestAltitude;
        }
        return highestAltitude;
    }


    public static void main(String[] args) {
        int[] gains ={-5,1,5,0,-7};
        HighestAltitude solution = new HighestAltitude();
        System.out.println(solution.largestAltitude(gains));

    }
}
