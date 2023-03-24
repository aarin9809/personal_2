import java.util.Scanner;

public class CodeUp_1035 {
    public static void main(String[] args) {
        //1035번
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = Integer.parseInt(a,16);
        System.out.printf("%o", b);
    }
}
