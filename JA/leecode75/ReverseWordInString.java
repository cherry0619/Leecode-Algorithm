package JA.leecode75;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseWordInString {
    // Given an input string s, reverse the order of the words.
    // A word is defined as a sequence of non-space characters. 
    // The words in s will be separated by at least one space.
    // Return a string of the words in reverse order concatenated by a single space.
    // Note that s may contain leading or trailing spaces or multiple spaces between two words. 
    // The returned string should only have a single space separating the words. Do not include any extra spaces.
    // step 1 split the string
    //  step 2 reverse the words: use stack
    private Stack<String> splitString(String s){
        String[] splitStrings =s.split(" ");
        for(String i :splitStrings){System.out.println(i);}
        Stack<String> stack = new Stack<>();
        for(int i =0;i<splitStrings.length;i++){
            if (splitStrings[i] !=""){
                stack.push(splitStrings[i]);}
        }
        return stack;
    }
    
    public String reverseWords(String s) {
        StringBuilder newStr = new StringBuilder();
        Stack<String> stack = splitString(s);
        while(!stack.isEmpty()){
            newStr.append(stack.pop()+" ");
        }
        String res =newStr.toString();
        return res.substring(0,res.length()-1)+"==";
    }

    public static void main(String[] args) {
        ReverseWordInString solution = new ReverseWordInString();
        String s ="  hello world     " ;
        System.out.println(solution.reverseWords(s));
    }
}
