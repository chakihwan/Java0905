package chp10.ex10_1;

public class Wizard extends Novice {
    int mp;
    void fireBall(){
        System.out.printf("%s(HP : %d, MP : %d)의 파이어볼 ~0000000~~~\n",name, hp, mp);
    }
}
