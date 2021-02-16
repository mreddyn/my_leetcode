import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInArray {
    private static int fun(int []nums,int k){
        int count;
        count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> en : map.entrySet()){
            if(k == 0){
                if(en.getValue()>=2)
                    count++;
            }
            else{
                if(map.containsKey(en.getKey()+k))
                    count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int []nums = {3,1,4,1,5};
        int k = 2;
        System.out.println(fun(nums, k));
    }
    
}
