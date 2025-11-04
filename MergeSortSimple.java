public class MergeSortSimple {

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40, 50, 30, 10};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);       // left part
            mergeSort(arr, mid + 1, high);  // right part

            merge(arr, low, mid, high);     // merge both parts
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[high - low + 1];

        // Compare and merge
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right
        while (j <= high) {
            temp[k++] = arr[j++];
        }

        // Copy temp back to original array
        for (i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}
