import java.util.HashMap;

public class SubArraySumEqualsK {
    private static int fun(int []nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum,count;
        sum = 0;count = 0;
        for(int i:nums){
            sum = sum+i;
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int []nums = {1,2,3};
        int k = 3;
        System.out.println(fun(nums, k));
    }
    
}
