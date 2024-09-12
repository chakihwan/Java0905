package chp07.ex10;

public class BicycleMain {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();

        b1.setName("김재홍");
        b1.setWeight(999);
        b1.setPrice(10);

        System.out.printf("b1=>{%s, %.2f㎏, %d원}\n",b1.getName(),b1.getWeight(),b1.getPrice());

    }
}
