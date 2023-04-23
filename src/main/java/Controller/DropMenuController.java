package Controller;

import Model.gameandbattle.Government;
import Model.gameandbattle.map.Map;

import java.util.regex.Matcher;

public class DropMenuController{
    private Map map;
    private Government government;

    public DropMenuController(Map map, Government government) {
        this.map = map;
        this.government = government;
    }
    public String setTileTexture(Matcher matcher){
        return null;
    }
    public String setGroupTexture(Matcher matcher){
        return null;
    }
    public String clear(Matcher matcher){
        return null;
    }
    public String dropRock(Matcher matcher){
        return null;
    }
    public String dropTree(Matcher matcher){
        return null;
    }
    public String dropWater(Matcher matcher){
        return null;
    }
    public String dropBuilding(Matcher matcher){
        return null;
    }
    public String dropUnit(Matcher matcher){
        return null;
    }
    private boolean isCoordinateValid(int x,int y){
        return false;
    }
    private boolean isThereABuilding(int x,int y){
        return false;
    }
    private boolean isCellMaterialOKForTrees(int x,int y){
        return false;
    }
    private boolean isCellMaterialOKForBuildings(int x,int y){
        return false;
    }
    private boolean isCellMaterialOKForUnits(int x,int y){
        return false;
    }
}
