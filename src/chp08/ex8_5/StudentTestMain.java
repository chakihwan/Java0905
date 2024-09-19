package chp08.ex8_5;

public class StudentTestMain {
    public static void main(String[] args) {

        StudentTest s1 = new StudentTest(20240101,"유현주");
        StudentTest s2 = new StudentTest(20240102,"김");
        StudentTest s3 = new StudentTest(20240103,"박");

        System.out.printf("Student 객체의 수 : %d",StudentTest.count);
    }

}
