import javax.sound.midi.SysexMessage;
import javax.swing.text.Style;
import java.io.*;
import java.nio.Buffer;
import java.nio.file.FileSystemNotFoundException;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;

public class CodeUp_1099 {
    public static void main(String[] args) throws IOException {
        /*
        1. 배열 초기화
        2. 배열 세팅
        3. 배열 출력

        배열의 크기는 10 * 10

        1-1. 벽을 먼저 설정한다?
        1-2. 0으로 입력된 수를 9로 치환한다? -> 가지않은 길도 있기 때문에 안됨
        1-3. 개미 출발 좌표 2,2부터. 1을 만나면 y값을 증가 다음 x값이 0이면 x값 증가
         */

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[10][10];

        //배열 입력 및 초기화
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        //배열 세팅
        int curX = 2-1;
        int curY = 2-1;
        while (true) {
            if (arr[curY][curX] == 2) {
                arr[curY][curX] = 9;
                break;
            }
            arr[curY][curX] = 9;

            if (arr[curY][curX+1] == 0 || arr[curY][curX + 1] == 2) {
                curX++;
            } else if (arr[curY + 1][curX] == 0 || arr[curY + 1][curX] == 2)
            {
                curY++;
            } else {
                break;
            }
        }



        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }
}