package jp.ac.uryukyu.ie.e235729;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackTest(){
    int defaultHeroHp = 100;
    Warrior demoWarrior = new Warrior("デモ勇者", defaultHeroHp, 10);
    Enemy slime = new Enemy("スライムもどき", 100, 10);
    for(int i = 0; i<4; i++){
        demoWarrior.attackWithWeponSkill(slime);
        int DamageProbably = (int)(demoWarrior.getAttack() *1.5);
        assertEquals(100 - (i+1) * DamageProbably,slime.getHitPoint());
        }
    }
}