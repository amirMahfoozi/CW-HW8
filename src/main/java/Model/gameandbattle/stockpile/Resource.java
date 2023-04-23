package Model.gameandbattle.stockpile;

public enum Resource {
    WOOD("",0,0),
    METAL("",0,0),
    STONE("",0,0),
    PITCH("",0,0),
    WHEAT("",0,0),
    FLOOR("",0,0),
    ALE("",0,0),
    HOPS("",0,0);
    private final String name;
    private final int price;
    private final int sellPrice;

    Resource(String name, int price, int sellPrice) {
        this.name = name;
        this.price = price;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
