import java.util.Arrays;
import java.util.Scanner;

public class bj_2577 {
    public static void main(String[] args) {

        // 세 개의 자연수 abc가 주어진다.
        // 세 수의 곱에서 0부터 9까지 몇번 쓰였는지 출력하라.

        //a,b,c를 곱한 후에 이를 문자열로 저장하여 배열을 돌면서
        //각 숫자가 몇개인지 센다.

        Scanner sc = new Scanner(System.in);

        int abc = (sc.nextInt() * sc.nextInt() * sc.nextInt());
        String str = Integer.toString(abc);

        for (int i=0; i<10; i++){
            int cnt = 0;
            for (int j=0; j<str.length(); j++){
                if ((str.charAt(j) - '0') == i){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
