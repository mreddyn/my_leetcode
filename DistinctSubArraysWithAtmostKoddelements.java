import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctSubArraysWithAtmostKoddelements {
    private static int fun(int []nums,int p){
          int n,count;
          n = nums.length;count = 0;
          List<List<Integer>> list = new ArrayList<>();
          List<Integer> templist;
          Set<String> set = new HashSet<>();
          for(int i=0;i<n;i++){
              
              for(int j=i;j<n;j++){
                    templist = new ArrayList<>();
                    for(int k=i;k<=j;k++){
                        templist.add(nums[k]);
                    }
                    list.add(templist);
              }
              
          }
          System.out.println(list);
        return 0;
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        int k = 1;
        fun(nums, k);

    }
    
}
