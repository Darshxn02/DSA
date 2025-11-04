import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40, 50, 30, 10};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i; 

            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }


        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
