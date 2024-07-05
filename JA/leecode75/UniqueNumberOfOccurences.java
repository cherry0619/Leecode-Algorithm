package JA.leecode75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurences {
    // Example 1:
    // Input: arr = [1,2,2,1,1,3]
    // Output: true
    // Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
    
    // Example 2:
    // Input: arr = [1,2]
    // Output: false

    // Example 3:
    // Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
    // Output: true

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            int value = map.getOrDefault(num, 0) +1;
            map.put(num, value);
        }
        
        Set<Integer> values = new HashSet<>(map.values());
        return (values.size() != map.size())?false:true;
    }

    public static void main(String[] args) {
        UniqueNumberOfOccurences solution = new UniqueNumberOfOccurences();
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0,0};
        System.out.println(solution.uniqueOccurrences(arr));
    }
}
