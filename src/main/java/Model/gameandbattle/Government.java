package Model.gameandbattle;

import Model.gameandbattle.battle.Troop;
import Model.gameandbattle.map.Building;
import Model.gameandbattle.stockpile.Food;
import Model.gameandbattle.stockpile.Granary;
import Model.gameandbattle.stockpile.Resource;
import Model.gameandbattle.stockpile.Stockpile;
import Model.signup_login_profile.User;

import java.util.ArrayList;
import java.util.HashMap;

public class Government {
    private static final int limitOfResources = 5;
    private int popularity;
    private int foodRate;
    private User ruler;
    private int taxRate;
    private int coin;
    private int fearRate;
    private Stockpile stockpile;
    private Granary granary;
    private int population;
    private int maxPopulation;
    private ArrayList<Building> buildings;
    private String color;
    private Troop king;
    private int workersEfficiency;

    public Government(int popularity, int foodRate, User ruler, int taxRate, int coin, int fearRate, int population, String color) {
        this.popularity = popularity;
        //initialize food here
        this.foodRate = foodRate;
        this.ruler = ruler;
        this.taxRate = taxRate;
        this.coin = coin;
        this.fearRate = fearRate;
        this.population = population;
        this.color=color;
        buildings = new ArrayList<>();
        stockpile=new Stockpile(0,0,0,0,0,0,0,0);
        granary=new Granary(0,0,0,0);
        workersEfficiency=100;
    }
    ////////////////////setters and getters////////////////////


    public Troop getKing() {
        return king;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public Granary getGranary() {
        return granary;
    }

    public void setGranary(Granary granary) {
        this.granary = granary;
    }

    public int getFoodRate() {
        return foodRate;
    }

    public void setFoodRate(int foodRate) {
        this.foodRate = foodRate;
    }

    public User getRuler() {
        return ruler;
    }

    public void setRuler(User ruler) {
        this.ruler = ruler;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getFearRate() {
        return fearRate;
    }

    public void setFearRate(int fearRate) {
        this.fearRate = fearRate;
    }

    public int getMaxPopulation() {
        return maxPopulation;
    }

    public void setMaxPopulation(int maxPopulation) {
        this.maxPopulation = maxPopulation;
    }

    public Stockpile getStockpile() {
        return stockpile;
    }

    public void setStockpile(Stockpile stockpile) {
        this.stockpile = stockpile;
    }

    public int calculateAllResource() {
        return 0;
    }

    public Building getBuildingByName(String name)
    {
        for (Building building : buildings) {
            if(building.getName().equals(name))
                return building;
        }
        return null;
    }

    public String getColor() {
        return color;
    }

    public void setWorkersEfficiency(int workersEfficiency) {
        this.workersEfficiency = workersEfficiency;
    }

    public int getWorkersEfficiency() {
        return workersEfficiency;
    }
}
