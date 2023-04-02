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

public class CodeUp_1098 {
    public static void main(String[] args) throws IOException
    {
        //1463
        //왼쪽 밑에서부터 올라오면서 1부터 1씩 증가하는 4 X 4 2차원 배열
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] arr = new int[h][w];

        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                arr[i][j] = 0;
            }
        }


        //setup
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {

            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            /*
            1. 좌표 설정
            2. 방향 지정
            3. 해당 칸 만큼 1로 세팅
             */
            for (int k = 0; k <l; k++) {
                if (d == 0) { // x증가
                    arr[x][y+k] = 1;
                } else { // y증가
                    arr[x+k][y] = 1;
                }
            }
            //output
            for (int a=0; a<h; a++) {
                for (int b=0; b<w; b++) {
                    System.out.print(arr[a][b]+ " ");
                }
                System.out.println("");
            }
        }

        //output
        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}