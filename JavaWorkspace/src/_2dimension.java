import java.util.Arrays;
import java.util.Scanner;

public class _2dimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //2차원배열 생성
        int n = sc.nextInt();
        Integer[][] weeks2 = new Integer[n][n];

        int cnt =1;

        //2차원 배열 초기화
        for(int y = 0; y<n; y++){
            for(int x = 0; x<n; x++){
                weeks2[x][y] = cnt;
                cnt++;
            }
        }

        //2차원 배열 출력
        for(int y=0; y<n; y++){
            for(int x=0; x<n; x++){
                System.out.printf("%d ", weeks2[y][x]);
            }
            System.out.println("");
        }


    }
}
