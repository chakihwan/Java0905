package chp08.ex08;

public class Monster {
    private String name;
    private int hp;
    private static int maxHP = 30;

    public Monster(String name){
        this.name = name;
        this.hp = maxHP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void attack(Monster enemy){
        enemy.hp -= 10;
        System.out.printf("[%s]의 공격 -> %s의 체력: %d/%d\n",getName(),enemy.getName(),enemy.getHp(),maxHP);

    }
    public static void battle(Monster a, Monster b){
        while (a.hp >0 && b.hp >0){
            Monster attacker = (Math.random()< 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender);
        }
    }
}
