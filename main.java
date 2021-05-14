import java.util.Scanner;
import java.lang.Math;

public class main {
    public static void main(String args[]){
        Scanner matrices = new Scanner(System.in);

        int matrix1[][] = new int[3][3];
        System.out.println("Enter the elements of the first matrix");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix1[i][j] = matrices.nextInt();
            }
        }
        int matrix2[][] = new int[3][3];
        System.out.println("Enter the elements of the second matrix");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix2[i][j] = matrices.nextInt();
            }
        }
        // matrices addition//
        int finalmatrix[][] = new int[3][3];
        finalmatrix[0][0] = matrix1[0][0] + matrix2[0][0];
        finalmatrix[0][1] = matrix1[0][1] + matrix2[0][1];
        finalmatrix[0][2] = matrix1[0][2] + matrix2[0][2];
        finalmatrix[1][0] = matrix1[1][0] + matrix2[1][0];
        finalmatrix[1][1] = matrix1[1][1] + matrix2[1][1];
        finalmatrix[1][2] = matrix1[1][2] + matrix2[1][2];
        finalmatrix[2][0] = matrix1[2][0] + matrix2[2][0];
        finalmatrix[2][1] = matrix1[2][1] + matrix2[2][1];
        finalmatrix[2][2] = matrix1[2][2] + matrix2[2][2];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(finalmatrix[i][j]);
            }
        }
        matrices.close();
    }
}
