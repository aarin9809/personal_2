import java.util.Scanner;


//top - down 재귀함수 방식
public class fivo {
    public static int fibo(int n) {
        if (n ==0) {
            return 0;
        }
        if (n == 1 || n ==2) {
            return 1;
        }

        //n이 3 이상일 경우 아래 로직 실행
        return fibo(n-1) + fibo(n-2);
    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibo(n));
    }
}
