package Model.gameandbattle.stockpile;

public class Stockpile {
    private int wood;
    private int pitch;
    private int metal;
    private int stone;
    private int wheat;
    private int floor;
    private int hops;
    private int ale;

    public Stockpile(int wood, int pitch, int metal, int stone, int wheat, int floor, int hops, int ale) {
        this.wood = wood;
        this.pitch = pitch;
        this.metal = metal;
        this.stone = stone;
        this.wheat = wheat;
        this.floor = floor;
        this.hops = hops;
        this.ale = ale;
    }
    /////////////////////setters and getters

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getWheat() {
        return wheat;
    }

    public void setWheat(int wheat) {
        this.wheat = wheat;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getHops() {
        return hops;
    }

    public void setHops(int hops) {
        this.hops = hops;
    }

    public int getAle() {
        return ale;
    }

    public void setAle(int ale) {
        this.ale = ale;
    }
}
