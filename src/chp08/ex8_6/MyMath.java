package chp08.ex8_6;

public class MyMath {
//  공유(static)영역 할당되는 메소드:클래스메소드
    static int max(int n1, int n2){
        return n1 > n2 ? n1 : n2;
        //n1이 n2보다 크다면 n1를 반환하고, 작다면 n2를 반환하라는 뜻
    }
    static int min(int n1, int n2){
        return n1 < n2 ? n1 : n2;
        //n1이 n2보다 작다면 n1를 반환하고, 크다면 n2를 반환하라는 뜻
    }
}
