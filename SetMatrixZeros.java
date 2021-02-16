import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {
    private static void fun(int [][] matrix){
        int m,n;
        m = matrix.length;
        n = matrix[0].length;
        Set<Integer> rowset = new HashSet<>();
        Set<Integer> colset = new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    rowset.add(i);
                    colset.add(j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rowset.contains(i)) matrix[i][j] = 0;
                if(colset.contains(j)) matrix[i][j] = 0;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int [][]matrix = {{1,1,1},{1,0,1},{1,1,1}};
        fun(matrix);
    }
    
}
