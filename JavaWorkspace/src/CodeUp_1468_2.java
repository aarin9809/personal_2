import java.util.Scanner;

public class CodeUp_1468_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int cnt = 1;
        boolean rev = false;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (!rev) {     //정방형
                    arr[i][j] = cnt;
                }else {         //역방형
                    arr[i][n-1-j] = cnt;
                }
                cnt++;
                rev = !rev;     //switch toggle
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
