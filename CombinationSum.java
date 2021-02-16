import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    private static List<List<Integer>> comb(int []nums,int target){
        List<List<Integer>> list = new ArrayList<>();
        back(list, new ArrayList<>(), nums, target, 0);
        return list;
    }
    private static void back(List<List<Integer>> list, List<Integer> templist, int []nums,int remain,int start){
         if(remain<0)
           return;
         else if( remain == 0){
             list.add(new ArrayList<Integer>(templist));
         }
         else{
             for(int i=start;i<nums.length;i++){
                 templist.add(nums[i]);
                 back(list, templist, nums, remain-nums[i], i);
                 //templist.remove(templist.size()-1);
             }
         }
    }
    public static void main(String[] args) {
        int []nums = {2,3,6,7};
        int target = 7;
        System.out.println(comb(nums, target));
    }
    
}
