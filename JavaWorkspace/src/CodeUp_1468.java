import java.util.Scanner;

public class CodeUp_1468 {
    public static void main(String[] args) {
        //4x4 2차원 배열
        /*1234
          8765
          9101112
          ...
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int cnt = 1;

        for (int i=0; i<n; i++){
            if (i % 2 != 0) {
                for (int j=n-1; j>=0; j--) {
                    arr[i][j] = cnt;
                    cnt++;
                }
            }
            else {
                for (int j=0; j<n; j++) {
                    arr[i][j] = cnt;
                    cnt++;
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }



    }
}
