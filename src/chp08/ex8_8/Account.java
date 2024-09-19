package chp08.ex8_8;

public class Account {

    private String name;
    private String password;
    private String acc;
    private int balance;

    public Account( String name, String password, String acc,int balance) {
        this.balance = balance;
        this.name = name;
        this.password = password;
        this.acc = acc;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    public String getAcc() {
        return acc;
    }
    public void deposit(int money) {
        this.balance += money;
//        System.out.printf("%d원 입금완료 잔액은: %d 입니다. ", balance, this.getBalance());
    }
    public void withdrew(int money) {
        this.balance -= money;
//        System.out.printf("%d를 출금하였습니다.",balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", acc='" + acc + '\'' +
                ", balance=" + balance +
                '}';
    }
}
