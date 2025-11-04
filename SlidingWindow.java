public class SlidingWindow {

    public static void main(String[] args) {
        int vday[] = {100, 200, 300, 400, 500, 100};
        int k = 3;
        int max = 0, sum = 0;

        // Step 1: Calculate sum of first window
        for (int i = 0; i < k; i++) {
            sum += vday[i];
        }

        // Step 2: Initialize max with first window sum
        max = sum;

        // Step 3: Slide the window across the array
        for (int i = k; i < vday.length; i++) {
            sum = sum - vday[i - k] + vday[i]; // remove leftmost, add next
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println("Maximum sum of " + k + " consecutive days = " + max);
    }
}
