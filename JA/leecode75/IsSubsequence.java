package JA.leecode75;

public class IsSubsequence {
    // Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

    // A subsequence of a string is a new string that is formed 
    // from the original string by deleting some (can be none) 
    // of the characters without disturbing the relative positions of the remaining characters.
    //  (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

    // Example 1:
    // Input: s = "abc", t = "ahbgdc"
    // Output: true
    // Example 2:
    // Input: s = "axc", t = "ahbgdc"
    // Output: false
    public boolean isSubsequence(String s, String t) {
        // edge case
        if(s.length()==0){return true;}
        int idxT = 0;
        for (int i =0;i<s.length();i++){
            for (int j =idxT;j<t.length();j++){
                if (t.charAt(j) ==s.charAt(i) && i ==s.length()-1){
                    return true;
                } else if(t.charAt(j) != s.charAt(i) && j ==t.length()-1){
                    return false;
                }else if (t.charAt(j) ==s.charAt(i)){
                    idxT =j+1;
                    break;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        IsSubsequence solution = new IsSubsequence();
        System.out.println(solution.isSubsequence(s, t));
    }
}
