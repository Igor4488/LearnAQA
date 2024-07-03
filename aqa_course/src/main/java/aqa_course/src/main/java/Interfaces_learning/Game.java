package Interfaces_learning;

public class Game {

    public static void main(String[] args) {

        Warrior war1 = new Warrior();
        Troll trl1 = new Troll();
        int damageToTroll = 15;
        war1.attackToEnemy(damageToTroll);
        trl1.damageFromEnemy(damageToTroll);
        trl1.damageFromEnemy(damageToTroll);
        trl1.damageFromEnemy(damageToTroll);
        trl1.damageFromEnemy(damageToTroll);



    }
}
