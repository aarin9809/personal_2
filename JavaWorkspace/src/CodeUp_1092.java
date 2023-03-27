import java.util.*;
public class CodeUp_1092 {
    public static void main(String[] args) {
        //1092
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        int day = 1;

        while (day % a != 0 || day % b != 0 || day % c != 0) {
            day++;
        }
        System.out.println(day);
    }
}
