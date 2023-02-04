import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        String a = "hello";
        String b = "java";
        String c = "hello";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);

        int[] odds = {1, 3, 5, 7, 9};

        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        for (int i =0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add(138);
        pitches.add("142");
        for (int i = 0; i < pitches.size();i++) {
            System.out.println(pitches.get(i));
        }

        ArrayList pitches2 = new ArrayList();
        pitches2.add("139");
        pitches2.add("123");

        String one = (String) pitches2.get(0);
        String two = (String) pitches2.get(1);


        ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList("138",
                "129", "142"));
        String result2 = "";
        for (int i = 0; i < pitches.size(); i++) {
            result2 += pitches.get(i);
            result2 += ",";
        }
        result2 = result2.substring(0, result2.length() - 1);
        System.out.println(result2);

    }
}