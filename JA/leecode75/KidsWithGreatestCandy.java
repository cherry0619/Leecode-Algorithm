package JA.leecode75;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class KidsWithGreatestCandy {
    // There are n kids with candies. 
    // You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
    // Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
    // Note that multiple kids can have the greatest number of candies.
    // step 1: find the max number and index first
    private int findMaxIntegers(int[] candies){
        int max = -1;
        for(int i =0;i<candies.length;i++){
            if (max < candies[i]){max=candies[i];}
        }
        return max;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);
        System.out.println(res.size());
        int max = findMaxIntegers(candies);
        for (int i=0;i<candies.length;i++){
            if(candies[i]+ extraCandies >=max){
                res.add( true);
            }else{res.add( false);}
        }
        return res;
    }


    public static void main(String[] args) {
        KidsWithGreatestCandy solution = new KidsWithGreatestCandy();
        int[] candies = {2,3,5,1,3};
        int extraCandies =3;
        System.out.println(solution.kidsWithCandies(candies, extraCandies));
    }

}
