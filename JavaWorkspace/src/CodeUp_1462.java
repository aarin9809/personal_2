import java.util.Scanner;

public class CodeUp_1462 {
    public static void main(String[] args) {
        //1462
        Scanner sc = new Scanner(System.in);

        //2차원 배열 생성
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int cnt = 1;

        //2차원 배열 초기화
        for (int y =0; y<n; y++) {
            for(int x =0; x<n; x++){
                arr[x][y] = cnt;            //
                cnt++;
            }
        }

        //2차원 배열 출력
        for (int y=0; y<n; y++){
            for (int x=0; x<n; x++){
                System.out.printf("%d ", arr[y][x]);
            }
            System.out.println("");
        }

    }
}
