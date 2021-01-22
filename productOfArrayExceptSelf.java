public class productOfArrayExceptSelf {
    private static int[] fun(int []nums){
        int n,temp;
        n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int res[] = new int[n];
        temp = 1;
        for(int i=0;i<n;i++){
            temp = temp*nums[i];
            left[i] = temp;
        }
        temp = 1;
        for(int i=n-1;i>=0;i--){
            temp = temp*nums[i];
            right[i] = temp;
        }
        int templ,tempr,j,k;
        for(int i=0;i<n;i++){
            templ = 1;tempr = 1;j=i-1;k=i+1;
            if(j>=0){
                templ = left[j];
            }
            if(k<=n-1){
                tempr = right[k];
            }
            res[i] = templ*tempr;
        }
        
        return res;
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        fun(nums);
    }
    
}
