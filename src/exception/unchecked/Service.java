package exception.unchecked;

public class Service {
    Client client = new Client();

    //필요한 경우 예외 처리
    public void callCatch() {
        try {
            client.call();
        } catch(MyUnCheckedException e) {
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    //예외 잡지 않아도 됨
    public void callThrow() {
        client.call();
    }
}
