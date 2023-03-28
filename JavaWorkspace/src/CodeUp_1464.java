import java.util.Scanner;

public class CodeUp_1464 {
    public static void main(String[] args) {
        //입력이 2 3으로 들어옴 i가 2 j가 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        int cnt = 1;

        //초기화
        for (int i=n-1; i>=0; i--) {
            for (int j=m-1; j>=0; j--) {
                arr[i][j] = cnt;
                cnt++;
            }
        }



        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }


    }
}
