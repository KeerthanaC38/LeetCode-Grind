package LeetCode75;

import java.util.ArrayList;
import java.util.List;

class KidsWithGreatesNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        ArrayList<Boolean> al=new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max)
                max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]<max-extraCandies){
                al.add(false);
            }
            else
                al.add(true);
        }

    return al;
    }
}