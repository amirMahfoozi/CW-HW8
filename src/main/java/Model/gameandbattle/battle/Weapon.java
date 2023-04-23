package Model.gameandbattle.battle;

public class Weapon {
    private String name;
    private int damage;
    private String material;

    public Weapon(String name,int damage,String material) {
        this.material = material;
        this.name=name;
        this.damage=damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
