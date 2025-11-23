import java.util.Scanner;

public class CelebrityProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        int[][] M = new int[n][n];
        System.out.println("Enter the matrix (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        int celebrity = findCelebrity(M, n);

        if (celebrity == -1)
            System.out.println("No celebrity found.");
        else
            System.out.println("Person " + celebrity + " is the celebrity!");

        sc.close();
    }

    public static int findCelebrity(int[][] M, int n) {
        int cand = 0;

        for (int i = 1; i < n; i++) {
            if (M[cand][i] == 1) {
                cand = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == cand) continue;  

            if (M[cand][i] == 1 || M[i][cand] == 0) {
                return -1;
            }
        }

        return cand;
    }
}
