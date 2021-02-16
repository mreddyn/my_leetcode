public class SortTheStudentScores {
    private static int[] fun(int []nums,int pass){
        int n;
        n = nums.length;
        int left,right,mid,temp;
        left = 0;mid = 0;right = n-1;
        while(mid<=right){
            if(nums[mid]<pass){
                temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                left++;
                mid++;
            }
            else if(nums[mid]==pass){
                mid++;
            }
            else{
                temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
        return nums;
    }
    public static void main(String[] args) {
        int []nums = {5,30,20,100,80,12,20,10,90};
        int pass = 20;
        fun(nums, pass);
        
    }
    
}
