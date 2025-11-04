public class TransposeMatrix {

    int size = 3;
    int[][] arr = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");       
            }
            System.out.println();
        }
    }

    public void transpose() {
        int[][] transposed = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)  {
                transposed[j][i] = arr[i][j];
            }   
        }
        arr = transposed;
    }

    public static void main(String[] args) {
        TransposeMatrix matrix = new TransposeMatrix();
        System.out.println("Original Matrix:");
        matrix.display();
        matrix.transpose();
        System.out.println("\nTransposed Matrix:");
        matrix.display();
    }

}
    