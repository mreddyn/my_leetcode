import java.util.PriorityQueue;

public class KthLargestElementInArray {
    private static int fun(int []nums,int k){
        PriorityQueue<Integer>pq = new PriorityQueue<>((n1,n2)->n1-n2);
        for(int i:nums){
            pq.add(i);
            System.out.println(pq);
            if(pq.size()>k){
                System.out.println(pq.poll());
            }
        }
        return pq.poll();
    }
    public static void main(String[] args) {
        int []nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(fun(nums, k));
    }
    
}
