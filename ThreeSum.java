import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    private static List<List<Integer>> fun(int []nums){
        int n,left,right,target,sum;
        List<List<Integer>> res = new LinkedList<>();
        n = nums.length;
        target = 0;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){

            if(nums[i]>0)break;
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
               left = i+1;
               right = n-1;
               sum = target - nums[i];
               while(left<right){
                   int temp = nums[left]+nums[right];
                   if(temp == sum){
                       res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                       while(left < right && nums[left] == nums[left+1]) left++;
                       while(left < right && nums[right] == nums[right-1]) right--;
                       left++;
                       right--;
                   }
                   else if(temp> sum)right--;
                   else left++;
               }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []nums = {-1,0,1,2,-1,-4};
        System.out.println(fun(nums));
    }
    
}
