package Model.gameandbattle.shop;

import Model.gameandbattle.stockpile.Food;
import Model.gameandbattle.stockpile.Resource;

import java.util.ArrayList;

public class Shop {
    private static Shop shop;
    private ArrayList<Resource> resources;
    private ArrayList<Food> foods;
    private Shop(){
        // TODO: 4/14/2023 fill here
    }

    public ArrayList<Resource> getResources() {
        return resources;
    }

    public void setResources(ArrayList<Resource> resources) {
        this.resources = resources;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

    public static Shop getShop() {
        if (shop == null)
            shop = new Shop();
        return shop;
    }
}
