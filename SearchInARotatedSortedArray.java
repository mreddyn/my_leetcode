
public class SearchInARotatedSortedArray {
    private static int fun(int []nums,int target){
        int n;
        n = nums.length;
        if(n == 0)
           return -1;
        
        int left,right,mid,pivot,b;
        boolean flag = false;
        left = 0; right = n-1; pivot = nums[right];
        while(left<right){
             mid = left+(right-left)/2;
             if(nums[mid]>=nums[mid+1] && nums[mid]>= nums[left]){
                 pivot = mid;
                 flag = true;
                 break;
             }
             else if(nums[mid]<=nums[mid+1] && nums[mid]>=nums[left]){
                 left = mid+1;
             }
             else 
                right = mid-1;
        }
        if(flag == false){
            pivot = left;
        }
        System.out.println("pivot "+pivot);
        if(pivot == n-1){
            int temp;
            temp=search(nums,0,n-1,target);
            if(temp > -1)
               return temp;
            return -1;
        }
        int res1,res2;
        res1 = search(nums,0,pivot,target);
        res2 = search(nums,pivot+1,n-1,target);
        System.out.println(res1+ " "+res2);
        if(res1 > -1)
            return res1;
        else if(res2 > -1)
            return res2;
        else 
            return -1;
          
    }
    static int search(int []nums,int left,int right,int target){
        
        int  mid;
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid] == target)
               return mid;
            else if(nums[mid] > target)
                right = mid-1;
            else
                left = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []nums = {3,1};
        int target = 1;
      System.out.println(fun(nums, target));
    }
    
}
