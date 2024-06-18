package JA.leecode75;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class ReverseVowelOfString {
    // Given a string s, reverse only all the vowels in the string and return it.
    // The vowels are 'a', 'e', 'i', 'o', and 'u', 
    // and they can appear in both lower and upper cases, more than once.
    // step 1 find out all vowels and index; queue to store index; stack to store vowels;
    private Map<String,Object> findVowel(String s){
        List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        Map<String,Object> map= new HashMap<String,Object>();
        Queue<Integer> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(vowels.contains(s.charAt(i))){
                queue.add(i);
                stack.push(s.charAt(i));
            }
        }
        map.put("index",queue);
        map.put("vowels", stack);
        return map;
    }
    
    // step 2 replace
    private String replaceVowels(String s,Map<String,Object> vowelsMap){
        Queue<Integer> index =(Queue<Integer>) vowelsMap.get("index");
        Stack<Character> vowels =(Stack<Character>) vowelsMap.get("vowels");
        StringBuilder newString = new StringBuilder(s);
        while(!vowels.isEmpty()){
            char a =vowels.pop();
            int ii =  index.poll();
            newString.setCharAt(ii, a);
        }
        return newString.toString();
    }

    public String reverseVowels(String s) {
        Map<String,Object> vowelsIndex = findVowel(s);
        String str = replaceVowels(s, vowelsIndex);
        return str;
    }
    public static void main(String[] args) {
        String s ="hello";
        ReverseVowelOfString solution = new ReverseVowelOfString();
        System.out.println(solution.reverseVowels(s));
    }

}
