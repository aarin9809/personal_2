import java.util.Scanner;

public class bj_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = ((n*n) + (m*m) + (a*a) + (b*b) + (c*c)) % 10;

        System.out.println(avg);
    }
}