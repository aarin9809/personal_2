import java.util.Scanner;

public class CodeUp_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int cnt = 1;


        for (int x=0; x<n; x++) {
            for (int y=n-1; y>=0; y--) {
                arr[y][x] = cnt;
                cnt++;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }



    }
}
