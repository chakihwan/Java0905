package chp08.ex07;

public class Account2 {
    private String num;
    private int balance;

    public Account2(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean transfer(Account2 account,int amount) {
        if(balance < amount){
            System.out.println("잔액이 부족하여 이체 불가능합니다.");
            return false;
        }
        this.balance = balance - amount;
        account.setBalance(account.getBalance() + amount);
        return true;
    }

    @Override
    public String toString() {
        return "Account2{" +
                "Num='" + num + '\'' +
                ", Balance=" + balance +
                '}';
    }
}
