public class Car {
    // 인스턴스 변수 생성
    int gas;

    // 연료 넣는 기능
    void setGas(int gas) {
        this.gas = gas;
    }

    //연료가 있는 지 없는 지 판별
    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("멈춥니다.");
            return false;
        }else {
            System.out.println("연료가 있습니다.");
            return true;
        }
    }

    void run() {
        while(true) {
            if (gas > 0) {
                System.out.println(gas);
                gas--;
            }else {
                System.out.println("멈춥니다.");
                break;
            }
        }
    }
}
