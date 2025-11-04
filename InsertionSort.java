import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40, 50, 30, 10};

        int n = arr.length;

        for (int i = 1; i < n-1; i++) {
            int j=i-1;
            int key=arr[i];
            while(arr[j]>key && arr[j]>=0){
                arr[j+1]=arr[j];
                j--;
            }
        }


        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
