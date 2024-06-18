package JA.leecode75;

class GreatestCommonDivisorOfString {

    private String repeatString(String str,int n){
        StringBuilder newString = new StringBuilder();
        while(n>0){
            newString.append(str);
            n--;
        }
        return newString.toString();
    }

    public String gcdOfStrings(String str1, String str2) {
        String shortString = str1.length()>str2.length()? str2:str1;
        int shortlen = shortString.length();
        // try the whole short string first, and the half
        for(int i =shortlen;i>0;i--){
            String preffix = str1.substring(0, i);
            String repeatString1 = repeatString(preffix, str1.length()/i);
            String repeatString2 = repeatString(preffix, str2.length()/i);
            if(repeatString1.equals(str1) && repeatString2.equals(str2)){
                return preffix;
            }
        }
        return "";
    }



    public static void main(String[] args){
        String str1 ="ABCABC";
        String str2 ="ABCABC";
        GreatestCommonDivisorOfString solution = new GreatestCommonDivisorOfString();
        System.out.println(solution.gcdOfStrings(str1, str2));
    }

}

