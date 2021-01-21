import java.util.Comparator;
import java.util.Arrays;

public class MeetingRooms {
    private static boolean fun(int [][]intervals){
        if(intervals == null)
         return false;
        
         Arrays.sort(intervals, new Comparator<int[]>(){
             public int compare(int []i1,int []i2){
                 return i1[0] - i2[0];
             }
         });
         for(int i=0;i<intervals.length-1;i++){
             if(intervals[i+1][0] < intervals[i][1]){
                 return false;
             }
         }
         return true;
    }
    public static void main(String[] args) {
        int intervals[][]= {{14,20},{6,14},{4,9}};
        System.out.println(fun(intervals));
    }
    
}
