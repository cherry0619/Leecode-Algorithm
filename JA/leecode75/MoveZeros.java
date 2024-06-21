package JA.leecode75;
import java.util.Arrays;

public class MoveZeros {
    // use an extra copy of array
    public int[] moveZeroes(int[] nums) {
        int [] newNums = new int[nums.length];
        int idx =0;
        for(int num: nums){
            if(num !=0){newNums[idx]=num; idx++;}
        }
        return newNums;
    }

    public void moveZeroesNoCpoy(int[] nums){
        int NoneZeroNums =0;
        for(int num: nums){
            if (num !=0){
                nums[NoneZeroNums] =num;
                NoneZeroNums++;
            }
        }
        for(int i= NoneZeroNums;i<nums.length;i++){
            nums[i] =0;
        }

        System.out.println(Arrays.toString(nums));
    }

    //  one track the current none zero idx
    // the other one track the zero numbers

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12,0,1,4,0};
        MoveZeros solution = new MoveZeros();
        solution.moveZeroesNoCpoy(nums);
        // System.out.println(Arrays.toString(solution.moveZeroes(nums)));
    }
}
