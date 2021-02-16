import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KmostFrequentElements {
    private static int[] fun(int []nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2)->map.get(n1)-map.get(n2));
        for(int i:map.keySet()){
            pq.add(i);
            if(pq.size()>k) pq.poll();
        }
        int res[] = new int[k];
        for(int i=k-1;i>=0;i--){
            res[i] = pq.poll();
        }
        return res;
    }
    public static void main(String[] args) {
        int []nums = {1,1,1,2,2};
        int k = 2;
        System.out.println(fun(nums, k));
    }
    
}
