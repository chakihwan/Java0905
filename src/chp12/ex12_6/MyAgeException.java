package chp12.ex12_6;
//사용자 정의 익셉션은 익셉션을 상송 받아야함
public class MyAgeException extends Exception {
    public MyAgeException(String msg) {
        super(msg);
    }
}
