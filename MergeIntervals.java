import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    private static int[][] fun(int [][]intervals){
        int m = intervals.length;
        if(m<=1)
          return intervals;
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int []i1,int []i2){
                return i1[0]-i2[0];
            }
            
        });
        for(int i=1;i<m;i++){
            if(intervals[i][0]>=intervals[i-1][1]){
                continue;
            }
            else{
                intervals[i][0] = intervals[i-1][0];
                intervals[i-1][0] = -1;
                intervals[i-1][1] = -1;
            }
        }
        for(int i=0;i<m;i++){
            System.out.println(intervals[i][0] +" "+intervals[i][1]);
        }
        int n,k;
        n = 0;
        for(int i=0;i<m;i++){
            if(intervals[i][0]==-1){
                continue;
            }
            else
              n++;
        }
        k = 0;
        int res[][] = new int[n][2];
        for(int i=0;i<m;i++){
            if(intervals[i][0]==-1){
                continue;
            }
            else{
                res[k][0] = intervals[i][0];
                res[k][1] = intervals[i][1];
                k++;
            }
        }
        System.out.println("new matrix");
        for(int i=0;i<res.length;i++){
            System.out.println(res[i][0] +" "+res[i][1]);
        }
        return res;
    }
    public static void main(String[] args) {
        int [][]intervals = {{1,3},{2,6},{8,10},{15,18}};
        fun(intervals);
    }
    
}
