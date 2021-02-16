import java.util.Arrays;

public class MeetingRooms2Meth_2 {
    private static int fun(int [][]intervals){
        int m;
        m = intervals.length;
        if(m==0)
          return 0;
        int start[] = new int[m];
        int end[] = new int[m];
        for(int i=0;i<m;i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int startptr,endptr,rooms;
        startptr = endptr = rooms = 0;
        while(startptr<m){
            if(start[startptr] >= end[endptr]){
                  endptr++;
                  startptr++;
            }
            else{
                 startptr++;
                 rooms++;
            }
        }

        return rooms;
    }
    public static void main(String[] args) {
        int [][]intervals = {{1,10},{2,7},{3,19},{8,12},{10,20},{11,30}};
        System.out.println(fun(intervals));
    }
    
}
