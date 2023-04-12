import java.util.Scanner;

public class bj_2884 {
    public static void main(String[] args) {
        // 45분 일찍 일어나는 알람 문제
        // 24시간 표현
        // 입력은 공백을 기준으로 구분되어 입력.
        // 출력시 불필요한 0은 사용하지 않음.


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b < 45) {       // 분이 45분 미만일때
            a--;            // 시를 1줄이고
            b = 60 - (45 -b);   //분 = 60 - (45- b)
            if (a < 0) {
                a = 23;
            }
            System.out.println(a + " " + b);
        }else {
            System.out.println(a + " " + (b - 45));
        }
    }
}
