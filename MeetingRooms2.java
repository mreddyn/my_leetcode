import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRooms2 {
    private static int fun(int [][]intervals){
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int []i1,int []i2){
                return i1[0] - i2[0];
            }
        });
        int temp;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<intervals.length;i++){
            if(pq.isEmpty()){
                pq.add(intervals[i][1]);
            }
            else{
                temp = pq.peek();
                if(intervals[i][0]>=temp){
                      pq.poll();
                      pq.add(intervals[i][1]);
                }
                else{
                     pq.add(intervals[i][1]);
                }
            }
        }
        return pq.size();
    }
    public static void main(String[] args) {
        int [][]intervals = {{1,10},{2,7},{3,19},{8,12},{10,20},{11,30}};
        System.out.println(fun(intervals));
    }
    
}
