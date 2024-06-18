package JA.leecode75;

public class CanPlaceFlower {
    // two step solution
    //  step 1, find the availability
    // Input: flowerbed = [1,0,0,0,1], n = 1

    private int findCapacity(int[] flowerbed){
        int capacity =0;
        // edge case
        if (flowerbed.length ==1){
            return flowerbed[0]==0?1:0;
        } 
        for(int i=0;i<flowerbed.length;i++){
            // head
            if(i ==0 && flowerbed[0]==0 && flowerbed[i+1]==0){
                capacity++;
                flowerbed[i]=1;
                i++;
            }
            //  middle
            else if (i>0 && i< flowerbed.length-1 && flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
                capacity++;
                flowerbed[i] =1;
                i++;
            // tail
            } else if (i == flowerbed.length -1 && flowerbed[i-1]==0 && flowerbed[i]==0){
                capacity++;
            }
        }
        return capacity;
    }

    // step 2
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int capacity = findCapacity(flowerbed);
        return capacity -n >=0?true:false;
    }


    public static void main(String[] args) {
        int[] flowerbed ={0,0,1,0,1};
        int n =1;
        CanPlaceFlower solution = new CanPlaceFlower();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }
}
