public class TwoSum2 {
    private static int[] fun(int []nums,int target){
        int []res = new int[2];
        int left,right,n;
        n = nums.length;
        left = 0;right = n-1;
        while(left<right){
            int temp = nums[left]+nums[right];
            if(temp == target){
                res[0] = left;
                res[1] = right;
            }
            else if(temp>target) right--;
            else left++;
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
    
}
