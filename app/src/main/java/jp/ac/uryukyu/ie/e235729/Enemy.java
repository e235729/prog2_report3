package jp.ac.uryukyu.ie.e235729;

public class Enemy extends LivingThing{
    public  Enemy (String name,int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    public void setName(String _name) {
        this.name = _name;
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

    public void setDead(boolean _dead) {
        this.dead = _dead;
    }
    
    @Override
    public void wounded(int damage){
        super.wounded(damage);
    }
}