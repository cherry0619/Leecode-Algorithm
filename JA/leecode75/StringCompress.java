package JA.leecode75;

import java.util.Arrays;

public class StringCompress {
    // After you are done modifying the input array, return the new length of the array.
    // You must write an algorithm that uses only constant extra space.

    // Example 1:
    // Input: chars = ["a","a","b","b","c","c","c"]
    // Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
    // Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
    
    // Example 2:
    // Input: chars = ["a"]
    // Output: Return 1, and the first character of the input array should be: ["a"]
    // Explanation: The only group is "a", which remains uncompressed since it's a single character.


    //  return the length
    public int compress(char[] chars) {
        int n = chars.length;
        // edge case
        if (n <=1){return n;}
        //  two pointer : one tracks the compressed index, 
       // the other one track the idx by iterating the array
       int write =0;
       int i =0;
       while(i < n){
        char currentChar = chars[i];
        int count =0;
        // find the consecutive sequence
        while(i<n && chars[i] == currentChar){
            count++;
            i++;
        }
        // replace 
        chars[write] = currentChar;
        write++;
        // replace the consecutive sequence
        if(count >1){
            for(char c: Integer.toString(count).toCharArray()){
                chars[write] = c;
                write++;
            }
        }
       }
    System.out.println(Arrays.toString(chars));
    return write;
    }


    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','c','c','c'};
        StringCompress solution = new StringCompress();
        System.out.println(solution.compress(chars));
    }


}
