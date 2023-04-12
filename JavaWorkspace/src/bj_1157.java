import java.util.Scanner;

public class bj_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String s = sc.next();

        for (int i=0; i< s.length(); i++) {
            if (65 <= s.charAt(i) && s.charAt(i) <= 90) {       // 대문자 범위
                arr[s.charAt(i) - 65]++;            //해당 인덱스 값 1증가
            }
            else {      //소문자 범위
                arr[s.charAt(i) - 97]++;
            }
        }
        int max = -1;
        char ch = '?';
        for (int i=0; i<26; i++){
            if (arr[i] > max) {
                max = arr[i];
                ch = (char)(i+65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
