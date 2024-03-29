import java.util.Scanner;

public class CodeUp_1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[20][20];
        for (int i =1; i<=19; i++) {
            for (int j=1; j<=19; j++){
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }


        int n = sc.nextInt();   //십자 뒤집기 횟수

        for (int i =0; i<n; i++) {
            //좌표 입력
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = 1; j <= 19; j++) {
                // x축 뒤집기
                if (arr[x][j] == 0) arr[x][j] = 1;
                else arr[x][j] = 0;

                // y축 뒤집기
                if (arr[j][y] == 0) arr[j][y] = 1;
                else arr[j][y] = 0;
            }

        }

        for (int i =1; i<=19; i++) {
            for (int j=1; j<=19; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }




    }
}
