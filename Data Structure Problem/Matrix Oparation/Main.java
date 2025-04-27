public class Main {
    public static void main(String[] args) {

        int row1 = 3;
        int col1 = 2;
        int row2 = 2;
        int col2 = 3;

        int[][] A = new int[row1][col1];
        int[][] B = new int[row2][col2];

        System.out.println("Randomly generate : ");

        for(int i = 0; i < row1; i++) {
            for(int j = 0; j < col1; j++) {
                A[i][j] = (int) (1 + (2 * Math.random()));
            }
        }

        for(int i = 0; i < row2; i++) {
            for(int j = 0; j < col2; j++) {
                B[i][j] = (int) (1 + (2 * Math.random()));
            }
        }

        System.out.println("Matrix A : ");
        for(int i = 0; i < row1; i++) {
            for(int j = 0; j < col1; j++) {
                System.out.print(A[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix B : ");
        for(int i = 0; i < row2; i++) {
            for(int j = 0; j < col2; j++) {
                System.out.print(B[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();

        MatrixOperator matrix = new MatrixOperator(A, B, row1, row2, col1, col2);

//        matrix.matrixAddition();
//        matrix.matrixSubtruction();
       matrix.matrixCrossMaltipication();
//        matrix.matrixTranspose();
    }
}