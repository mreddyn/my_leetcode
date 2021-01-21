import java.util.Arrays;

public class MeetingRoomsMethod_2 {
    private static boolean fun(int [][]intervals){
        int n = intervals.length;
        if(n == 0)
         return true;

        int begin[] = new int[n];
        int stop[] = new int[n];
        for(int i=0;i<n;i++){
            begin[i] = intervals[i][0];
            stop[i] = intervals[i][1];
        }
        Arrays.sort(begin);
        Arrays.sort(stop);
        for(int i=1;i<n;i++){
            if(begin[i]<stop[i-1])
               return false;
        }
        return true;

    }
    public static void main(String[] args) {
        int intervals[][]= {{14,20},{6,14},{4,9}};
        System.out.println(fun(intervals));
    }
    
}
