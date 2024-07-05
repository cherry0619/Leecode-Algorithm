package JA.leecode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDiffrentBetweenTwoArrays {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            List<List<Integer>> res = new ArrayList<>(2);
            // hash map
            HashMap<Integer,Integer> map1 = new HashMap<>();
            HashMap<Integer,Integer> map2 = new HashMap<>();
            for(int num :nums1){map1.put(num,num);}
            for(int num :nums2){map2.put(num,num);}

            // distinct value in nums1;
            List<Integer> uniqueV1 = new ArrayList<>();
            for(int num: map1.keySet()){
                if(!map2.containsKey(num)){uniqueV1.add(num);}
            }

            // distinct value in nums2
            List<Integer> uniqueV2 = new ArrayList<>();
            for(int num: map2.keySet()){
                if( !map1.containsKey(num)){uniqueV2.add(num);}
            }

            res.add(uniqueV1);
            res.add(uniqueV2);
            return res;
        }
}
