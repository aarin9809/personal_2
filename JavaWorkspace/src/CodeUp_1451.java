import java.util.*;


public class CodeUp_1451 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                   // 5 입력
        int[] arr = new int[n];                 // 5의 길이만큼 배열 생성

        for (int i=0; i<arr.length; i++) {      //i가 0부터 i를 arr배열의 길이전까지 반복
            int a = sc.nextInt();               //a라는 변수에다 정수 하나 입력받음(반복)
            arr[i] = a;                        //arr배열의 i번째(0번째부터 시작)해서 부터 a값을 넣음
        }

        for (int i=0; i<arr.length-1; i++){     // i를 0부터 3까지 총 4번 반복
            for (int j=0; j<arr.length-1; j++){// j를 0부터 3까지 총 4번 반복
                if(arr[j]>arr[j+1]) {           //만약 arr의 j번방 데이터가 arr의 j+1의 데이터보다 크다면,
                    int tmp = arr[j];           // 지역변수 tmp라는 변수에 arr[j]를 넣고
                    arr[j] = arr[j+1];          // arr[j]에 다가 arr[j+1]의 데이터를 넣고,
                    arr[j+1] = tmp;             // arr[j+1]에 다가는 tmp(기존 arr[j])의 데이터를 넣는다.
                }
            }
        }                                       //위의 과정을 거치면서 오름차순으로 배열의 데이터들을 정리한다.

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);         //정리 된 배열의 데이터들을 for문을 돌면서 출력한다.
        }
    }
}
