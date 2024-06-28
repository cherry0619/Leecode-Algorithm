package JA.leecode75;

import java.util.HashMap;
import java.util.Map;


public class MaxNumberOfKPairs {

    // use hashmap
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> resMap = new HashMap<>();
        int pairs =0;
        for(int num :nums){
            int target = k-num;
            //  if exists
            if (resMap.containsKey(target)&& resMap.get(target)>0){
                    pairs ++;
                    resMap.put(target, resMap.get(target)-1);
            } else{
                resMap.put(num, resMap.getOrDefault(num, 0)+1);
                }
        }
        return pairs;
    };

    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        int k =5;
        MaxNumberOfKPairs solution = new MaxNumberOfKPairs();
        System.out.println(solution.maxOperations(nums, k));
    }


}
