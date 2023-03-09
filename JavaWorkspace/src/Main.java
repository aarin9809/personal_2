import javax.swing.text.Style;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args)
    {
//        int a = 10;
//        String day = "three";
//        System.out.println(String.format("I eat %d apples. so I was sick for %s days", a, day));
//        System.out.println(String.format("Error is %d%%.", 98));
//        System.out.println(String.format("%10s", "hi"));
//        System.out.println(String.format("%10sjane", "hi"));
//        System.out.println(String.format("%.4f", 3.131484));
//        System.out.printf("I eat %d apples\n", 3);

////        Scanner sc = new Scanner(System.in);
////        String input = sc.nextLine();
////        String[] arr = input.split("\\.");
//////        System.out.printf("arr의 길이는 %d 입니다.\n", arr.length);
//////        System.out.println(arr[0]+arr[1]+arr[2]);
////        System.out.printf("%04d.%02d.%02d",
////                Integer.parseInt(arr[0]),
////                Integer.parseInt(arr[1]),
////                Integer.parseInt(arr[2])
//        );
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String[] arr = input.split("-");
//        System.out.println(arr[0]+arr[1]);
//        Integer a = 80;
//        Integer b = 75;
//        Integer c = 55;
//        Double avg = (a.doubleValue() + b.doubleValue() + c.doubleValue()) / 3;
//        System.out.printf("평균점수는 %.2f 입니다", avg);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("국어: ");
//        Double a = Double.parseDouble(sc.next());
//        System.out.print("영어: ");
//        Double b = Double.parseDouble(sc.next());
//        System.out.print("수학: ");
//        Double c = Double.parseDouble(sc.next());
//
//        Double avg = (a+b+c) / 3;
//
//        System.out.printf("평균점수: %.2f", avg);

//        String idcard = "881120-1234567";
//        String a = "a:b:c:d";
//        System.out.println("19"+idcard.substring(0,6)+" "+ idcard.substring(7,14));
//        System.out.println(idcard.charAt(7));
//        System.out.println(a.replaceAll(":", "#"));

//        ArrayList pitches = new ArrayList();
//        pitches.add("139");
//        pitches.add("129");
//        pitches.add("38");
//        System.out.println(pitches.get(1));

//        Integer money = 2000;
//        if (money >= 3000) {
//            System.out.println("택시");
//        }else {
//            System.out.println("걸어가");
//        }
//        Integer money = 2000;
//        boolean hasCard = true;
//
//        if (money >= 3000 || hasCard) {
//            System.out.println("택시");
//        }else{
//            System.out.println("걸어");
//        }
//        boolean hasCard = true;
//        ArrayList<String> pocket = new ArrayList<String>();
//        pocket.add("paper");
//        pocket.add("handphone");
//
//        if (pocket.contains("money")) {
//            System.out.println("택시");
//        }else {
//            if (hasCard){
//                System.out.println("택시");
//            }else {
//                System.out.println("걸어");
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//
//        Integer a,b,c;
//        a= Integer.parseInt(sc.next());
//        b= Integer.parseInt(sc.next());
//        c= Integer.parseInt(sc.next());
//
//        if (a%2==0){
//            System.out.printf("%d\n", a);
//        }
//        if (b % 2 == 0) {
//            System.out.printf("%d\n", b);
//        }
//        if (c % 2 == 0) {
//            System.out.printf("%d\n", c);
//        }
//        Scanner sc = new Scanner(System.in);
//        Integer a, b, c;
//
//        a = Integer.parseInt(sc.next());
//        b = Integer.parseInt(sc.next());
//        c = Integer.parseInt(sc.next());
//
//        if (a % 2 == 0) {
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }
//        if (b % 2 == 0) {
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }
//        if (c % 2 == 0) {
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }


//        String[] numbers = {"one", "two", "three"};
//        for(int i =0; i<numbers.length; i++){
//            System.out.println(numbers[i]);
//        }


//        int[] marks = {90,12,14,15,16};
//        for(int i =0; i<marks.length; i++){
//            if(marks[i] >=60){
//                System.out.println((i+1)+"번 학생은 합격입니다");
//            }else{
//                System.out.println((i+1)+"번 학생은 불합격입니다.");
//            }
//        }

//        for(int i=2; i<10; i++){
//            for(int j=1; j<10; j++){
//                System.out.print(i*j+" ");
//            }
//            System.out.println("");
//        }

//        Scanner sc = new Scanner(System.in);
//        Integer a, b;
//        a = Integer.parseInt(sc.next());
//        b = Integer.parseInt(sc.next());
//
//        Integer big = max(a,b);
//        Integer small = min(a,b);
//
//        for(int i=small; i<=big; i++) {
//            System.out.print(i+" ");
//
//        }
//        Scanner sc = new Scanner(System.in);
//        Integer a = Integer.parseInt(sc.next());
//
//        for(int i=1; i<10; i++){
//            System.out.println("*".repeat(i*a));
//        }

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