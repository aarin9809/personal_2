import java.util.Scanner;

public class CodeUp_1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = 25;
        for (int i = 0; i<n; i++) {
            int num = sc.nextInt();
            min = num < min ? num : min;
        }
        System.out.println(min);
    }
}
