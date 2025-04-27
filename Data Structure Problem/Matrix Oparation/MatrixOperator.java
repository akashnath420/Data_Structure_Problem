public class MatrixOperator {
    int[][] A;
    int[][] B;
    int row1;
    int row2;
    int col1;
    int col2;

    MatrixOperator(int[][] A, int[][] B, int row1, int row2, int col1, int col2) {
        this.A = A;
        this.B = B;
        this.row1 = row1;
        this.row2 = row2;
        this.col1 = col1;
        this.col2 = col2;
    }

    //    void matrixAddition() {
//
//        int [][] C = new int[row1][col1];
//
//        for(int i = 0; i < row1; i++) {
//            for(int j = 0; j < col1; j++) {
//                C[i][j] = A[i][j] + B[i][j];
//            }
//        }
//
//        System.out.println("Matrix Addition A + B : ");
//        for(int i = 0; i < row1; i++) {
//            for(int j = 0; j < col1; j++) {
//                System.out.print(C[i][j] +" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//    void matrixSubtruction() {
//
//        int [][] C = new int[row1][col2];
//
//        for(int i = 0; i < row1; i++) {
//            for(int j = 0; j < col1; j++) {
//                C[i][j] = A[i][j] - B[i][j];
//            }
//        }
//
//        System.out.println("Matrix Subtruction A - B : ");
//        for(int i = 0; i < row1; i++) {
//            for(int j = 0; j < col1; j++) {
//                System.out.print(C[i][j] +" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//
    void matrixCrossMaltipication() {

        if (col1 != row2) {
            return;

        }

        int[][] C = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                int sum = 0;
                for (int k = 0; k < col1; k++) {
                    sum = sum + A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        System.out.println("Matrix Cross Maltipication AxB : ");
        for(int i = 0; i < row1; i++) {
            for(int j = 0; j < col2; j++) {
                System.out.print(C[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
//
//    void matrixTranspose() {
//
//        System.out.println("Matrix A transpose : ");
//        for(int i = 0; i < row1; i++) {
//            for(int j = 0; j < col1; j++) {
//                System.out.print(A[j][i] +" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        System.out.println("Matrix B transpose : ");
//        for(int i = 0; i < row2; i++) {
//            for(int j = 0; j < col2; j++) {
//                System.out.print(B[j][i] +" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
}
