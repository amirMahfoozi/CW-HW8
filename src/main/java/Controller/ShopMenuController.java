package Controller;

import Model.gameandbattle.Government;

public class ShopMenuController {
    private Government government;

    public ShopMenuController(Government government) {
        this.government = government;
    }

    public String showPriceList(){
        return null;
    }
    public String buy(){
        return null;
    }
    public String sell(){
        return null;
    }
    public boolean isGoldEnough(){
        return false;
    }
    public boolean isLimitOfResourcesReached(){
        return false;
    }
}
