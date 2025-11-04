public class TwoDMatrix {

    int size = 3;
    int[][] arr = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    public void display() {
        int sum=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
                
            }
            
            System.out.println();
        }
        System.out.println("Sum:" + sum); 
    }

    public static void main(String[] args) {
        TwoDMatrix matrix = new TwoDMatrix();
        matrix.display();
    }
}
