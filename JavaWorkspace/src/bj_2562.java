import java.util.Scanner;

public class bj_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        int max = 0;
        int index =0;

        for (int value : arr) {
            count++;

            if (value > max) {
                max = value;
                index = count;
            }
        }
        System.out.print(max + "\n" + index);
    }
}