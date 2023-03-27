import java.util.Scanner;

public class CodeUp_1091 {
    public static void main(String[] args) {
        //1091
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();       //시작값
        int m = sc.nextInt();       //곱할값
        int d = sc.nextInt();       //더할값
        int n = sc.nextInt();       //몇 번째 수

        long result = a;

        for (int i=1; i<n; i++) {
            result = result*m + d;
        }

        System.out.println(result);
    }
}
