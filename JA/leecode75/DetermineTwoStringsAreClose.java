package JA.leecode75;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DetermineTwoStringsAreClose {
    // Example 1:
    // Input: word1 = "abc", word2 = "bca"
    // Output: true
    // Explanation: You can attain word2 from word1 in 2 operations.
    // Apply Operation 1: "abc" -> "acb"
    // Apply Operation 1: "acb" -> "bca"

    // Example 2:
    // Input: word1 = "a", word2 = "aa"
    // Output: false
    // Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
    
    // Example 3:
    // Input: word1 = "cabbba", word2 = "abbccc"
    // Output: true
    // Explanation: You can attain word2 from word1 in 3 operations.
    // Apply Operation 1: "cabbba" -> "caabbb"
    // Apply Operation 2: "caabbb" -> "baaccc"
    // Apply Operation 2: "baaccc" -> "abbccc"
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i =0;i< word1.length();i++){
            char c = word1.charAt(i);
            map1.put(c,map1.getOrDefault(c, 0)+1);
        }

        for(int i =0;i< word2.length();i++){
            char c = word2.charAt(i);
            map2.put(c,map2.getOrDefault(c, 0)+1);
        }

        Set<Character> keys1 = new HashSet<>(map1.keySet());
        Set<Character> keys2 = new HashSet<>(map2.keySet());
        List<Integer> values1 = new ArrayList<>(map1.values());
        Collections.sort(values1);
        List<Integer> values2 = new ArrayList<>(map2.values());
        Collections.sort(values2);

        //  check the key and values are the same
        boolean keyFlag =keys1.equals(keys2);
        boolean valueFlag =values1.equals(values2);
        return (keyFlag ==true && valueFlag==true)? true:false;
    }

    public static void main(String[] args) {
        String word1 = "aaabbbbccddeeeeefffff";
        String word2 = "aaaaabbcccdddeeeeffff";
        DetermineTwoStringsAreClose solution = new DetermineTwoStringsAreClose();
        System.out.println(solution.closeStrings(word1, word2));
    }
}
