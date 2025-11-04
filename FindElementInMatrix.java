public class FindElementInMatrix {

    int size = 3;
    int[][] arr = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    public void display() {
        int sum = 0;

        // Display the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int target = 9;

        // Search for the target element
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        FindElementInMatrix matrix = new FindElementInMatrix();
        matrix.display();
    }
}
