import java.util.Scanner;

public class CodeUp_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i =0; i<n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        for (int i=n-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }



    }
}
