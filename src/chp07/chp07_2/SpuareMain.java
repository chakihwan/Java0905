package chp07.chp07_2;

public class SpuareMain {
    public static void main(String[] args) {

        Square s1 = new Square();
        s1.setLength(5000);

        Square s2 = new Square();
        s2.setLength(400);

        int result2 = s2.area();
        System.out.printf("길이 %d㎝ 인 정사각형의 면적은 %d㎠ 입니다.",s2.getLength(),result2);

//        System.out.println(s1.getLength()+"의 넓이는 : "+s1.area());
//위 아래 같음
        int result1 = s1.area();
        System.out.printf("길이 %d㎝ 인 정사각형의 면적은 %d㎠ 입니다.",s1.getLength(),result1);

    }
}
