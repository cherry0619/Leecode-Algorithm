package JA.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DifferentWayToAddParenthesis {
//     Given a string expression of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. You may return the answer in any order.
// The test cases are generated such that the output values fit in a 32-bit integer and the number of different results does not exceed 104.
// Example 1:

// Input: expression = "2-1-1"
// Output: [0,2]
// Explanation:
// ((2-1)-1) = 0 
// (2-(1-1)) = 2

// Example 2:
// Input: expression = "2*3-4*5"
// Output: [-34,-14,-10,-10,10]
// Explanation:
// (2*(3-(4*5))) = -34 
// ((2*3)-(4*5)) = -14 
// ((2*(3-4))*5) = -10 
// (2*((3-4)*5)) = -10 
// (((2*3)-4)*5) = 10


// solution: iteration
private Map<String, List<Integer>> memo = new HashMap<>();

public List<Integer> diffWaysToCompute(String expression) {
    // check memory
    if (memo.containsKey(expression)){return memo.get(expression);}
    List<Integer> results = new ArrayList<>();
    for (int i=0;i<expression.length();i++){
        // if we find the operator
        char c = expression.charAt(i);
        if (c =='+' || c=='-' || c=='*'){
            List<Integer> lefList = diffWaysToCompute(expression.substring(0, i));
            List<Integer> righList = diffWaysToCompute(expression.substring(i+1, expression.length()));

            for (int left : lefList){
                for (int right : righList){
                    int res =0;
                    switch (c){
                        case '+': res = left +right;break;
                        case '-': res =left-right;break;
                        case '*': res =left * right;break; 
                    }
                    results.add(res);
                }
            }
        }        
    }
    if (results.isEmpty()){
        results.add(Integer.parseInt(expression));
    }
    memo.put(expression, results);
    return results;

}

    public static void main(String[] args) {
        DifferentWayToAddParenthesis solution = new DifferentWayToAddParenthesis();

        // Test case: "2-1-1"
        String expression = "2-1-1";
        // Expected output: [0, 2]
        System.out.println("Expression: " + expression);
        System.out.println("Output: " + solution.diffWaysToCompute(expression));
        
        // Test case: "2*3-4*5"
        String expression2 = "2*3-4*5";
        // Expected output: [-34, -14, -10, -10, 10]
        System.out.println("Expression: " + expression2);
        System.out.println("Output: " + solution.diffWaysToCompute(expression2));
    }
}

