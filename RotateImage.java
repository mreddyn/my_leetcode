public class RotateImage{
    private static void fun(int [][]matrix){
        int n,temp;
        n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int j=0;j<n/2;j++){
            for(int i=0;i<n;i++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        fun(matrix);
    }
}