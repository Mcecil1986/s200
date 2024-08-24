import java.util.Scanner;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        double[][] matrix = new double[4][4];
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a 4*4 matrix:");
        for (int row=0;row<4;row++) {
            for(int col=0;col<4;col++) {
               matrix[row][col]=input.nextDouble();
            }
       }
      double diagonalSum=sumMajorDiagonal(matrix);
      System.out.println("Sum of the major diagonal elements :"+diagonalSum);
    }
    public static double sumMajorDiagonal(double[][] m) {
        double sum=0.0;
        for(int i=0;i<m.length;i++){
            sum+=m[i][i];
        }
        return sum;
    }
}
