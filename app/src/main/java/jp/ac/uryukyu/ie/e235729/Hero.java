package jp.ac.uryukyu.ie.e235729;

public class Hero extends LivingThing{
    public Hero(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    public int getHitPoint() {
        return this.hitPoint;
    }

    public void setHitPoint(int _hitPoint) {
        this.hitPoint = _hitPoint;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int _attack) {
        this.attack = _attack;
    }

    @Override
    public void wounded(int damage){
        super.wounded(damage);
    }
}