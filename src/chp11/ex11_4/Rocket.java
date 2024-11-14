package chp11.ex11_4;

public class Rocket implements Flyable {
    @Override
    public void fly() {
        System.out.println("로켓이 수직상승합니다.");
    }
}
