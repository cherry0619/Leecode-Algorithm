package JA.leecode75;

public class MximumNumberOfVowel {
    String  vowels ="aeiou";

    public int maxVowels(String s, int k) {
        // first init the window
        int vowelNum =0;
        for(int i =0;i<k;i++){
            if(vowels.indexOf(s.charAt(i)) >=0){
                vowelNum ++;
            }
        }
        int maxVowelNum = vowelNum;

        //  slide the window
        for(int j =k;j<s.length();j++){
            int a = (vowels.indexOf(s.charAt(j-k)) <0)?0:1;
            int b = (vowels.indexOf(s.charAt(j)) <0)?0:1;
            vowelNum = vowelNum +b-a;
            maxVowelNum =(vowelNum > maxVowelNum)? vowelNum:maxVowelNum;
        }
        return maxVowelNum;
    }

    public static void main(String[] args) {
        MximumNumberOfVowel solution = new MximumNumberOfVowel();
        String s ="aeiou";
        int k =3;
        System.out.println(solution.maxVowels(s, k));
    }
}
