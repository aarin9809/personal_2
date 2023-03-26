import java.util.Scanner;

public class CodeUp_1442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        for (int i=0; i<n-1; i++){
            int min = i;
            for (int j=i+1; j<n; j++){
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }

    }
}
