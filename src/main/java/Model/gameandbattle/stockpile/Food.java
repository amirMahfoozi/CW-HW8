package Model.gameandbattle.stockpile;

public enum Food {
    MEAT(34,"meat",9),
    CHEESE(45,"cheese",4),
    BREAD(24,"bread",4),
    APPLE(47,"apple",4);
    private final int sellPrice;
    private final int price;
    private final String name;

    Food(int price, String name,int sellPrice) {
        this.price = price;
        this.name = name;
        this.sellPrice=sellPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
