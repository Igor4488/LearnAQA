package Interfaces_learning;

public class Troll {

    int trollHealth = 50;
    boolean trollAlive = true;

    public Troll() {
        this.trollHealth = trollHealth;
        this.trollAlive = trollAlive;
    }

    public void damageFromEnemy(int damageFromEnemy) {
        this.trollHealth = trollHealth - damageFromEnemy;

        if (this.trollHealth <= 0) {
            this.trollAlive = false;
        }

        System.out.println(trollHealth);
        System.out.println(trollAlive);
    }
    ;
}
