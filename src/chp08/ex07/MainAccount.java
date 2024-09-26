package chp08.ex07;

public class MainAccount {
    public static void main(String[] args) {
        Account2 a = new Account2("123-45", 10000);
        Account2 b = new Account2("567-89", 10000);

        while (a.transfer(b,3000)){
            ;
        }
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
