import java.util.Scanner;

public class CarEx {
    Scanner sc = new Scanner(System.in);
    int gasVal = 0;

    Car mycar = new Car();
    mycar.setGas(5);

    boolean gasStatus = mycar.isLeftGas();

    while(true) {
        if (gasStatus) {
            System.out.println("출발합니다.");
            mycar.run()
        }
    }


}
