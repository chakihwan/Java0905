package chp10.ex10_9;

//추상클래스
//자식클래스를 표준화 시키기위해서 만듬(표준화란 : 특정기능을 반드시 갖도록 하는것)
abstract public class Animal {
    private String name;

//    추상메소드
    public abstract void eat(String food);
    public abstract void cry(String sound);

    public void sleep(int hours){
        System.out.printf(hours + "시간 동안 잔다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
