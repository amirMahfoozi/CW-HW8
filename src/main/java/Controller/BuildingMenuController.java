package Controller;

import Model.gameandbattle.Government;
import Model.gameandbattle.map.Map;

import java.util.regex.Matcher;

public class BuildingMenuController {
    private Map map;
    private Government government;
    private String dropBuilding(Matcher matcher, Map map){
        return null;
    }
    public String selectBuilding(Matcher matcher){
        return  null;
    }
    public String createUnit(Matcher matcher){
        return null;
    }
    public String repair(){
        return  null;
    }
    public boolean isStockPilePlaceOK(int x ,int y){
        return false;
    }
    private boolean isCoordinateValid(int x,int y){
        return false;
    }
    private boolean isThisCellMaterialValid(int x,int y){
        return false;
    }
    private boolean isThereABuilding(int x,int y){
        return false;
    }
    private boolean doIHaveABuilding(int x,int y){
        return false;
    }
    private boolean isResourcesEnough(int x,int y){
        return false;
    }
    private boolean isThereEnoughPeople(int number){
        return false;
    }
    private boolean isUnitTypeValid(int number){
        return false;
    }
    private boolean isStoneEnough(int number){
        return false;
    }
    private boolean isEnemyClose(){
        return false;
    }
    public BuildingMenuController(Map map, Government government) {
        this.map = map;
        this.government = government;
    }
}
