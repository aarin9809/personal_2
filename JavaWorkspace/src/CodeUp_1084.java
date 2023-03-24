import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CodeUp_1084 {
    public static void main(String[] args) throws IOException {
        //1084
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        for (int i=0; i<a; i++){
            for (int j =0; j<b; j++){
                for (int k = 0; k<c; k++){
                    bw.write(String.valueOf(i)+" "+String.valueOf(j)+" "+String.valueOf(k)+"\n");
                    cnt++;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.close();

    }
}
