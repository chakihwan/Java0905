package chp08.ex8_5;

public class StudentTest {
//  공유(static)영역 할당: 클래스변수
    static int count = 0;

//  힙(non-static) 영역 할당: 인스턴스변수
    int id;
    String name;

    StudentTest(int id, String name){
        this.id = id;
        this.name = name;
        count++;
// count = count+1;
    }
}
