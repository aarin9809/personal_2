import java.util.*;
public class CodeUp_1093 {
    public static void main(String[] args) {
        //1093
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();           //10
        int[] arr = new int[24];

        for (int i=0; i<n; i++){
            int num = sc.nextInt();     // 1부터 입력
            arr[num-1] += 1;            //1-1=0 이므로 0번방부터 해서 1씩 증가하면서 차례차례 데이터를 입력함.
        }

        for (int i=0; i<23; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
