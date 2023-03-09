import java.util.Scanner;

public class newLine_12345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = 0;
        n = Integer.parseInt(sc.nextLine());
        String[] arr = sc.nextLine().split(" ");
        sc.close();

        for (int i =0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
