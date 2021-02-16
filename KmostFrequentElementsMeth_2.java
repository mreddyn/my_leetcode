import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KmostFrequentElementsMeth_2 {
    private static List<Integer> fun(int []nums,int k){
        int n;
        n = nums.length;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<Integer>[] bucket = new List[n+1];
        for(int i=0;i<bucket.length;i++) bucket[i] = new ArrayList<>();
        for(int i:map.keySet()) bucket[map.get(i)].add(i);
        List<Integer>res = new ArrayList<>();

        for(int i=bucket.length-1;i>=0;i--){
            res.addAll(bucket[i]);
            if(res.size()>=k) break;
        }
        return res;
    }
    public static void main(String[] args) {
        int []nums = {};
    }
    
}
