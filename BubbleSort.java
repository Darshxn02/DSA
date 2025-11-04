import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40, 50, 30, 10};

        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}