public class JumpGame {
    private static boolean fun(int []nums){
        int maxreach = 0;
        for(int i=0;i<nums.length;i++){
            if(maxreach<i) return false;
            maxreach = Math.max(maxreach,i+nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int []nums = {2,3,1,1,4};
        System.out.println(fun(nums));
    }
    
}
