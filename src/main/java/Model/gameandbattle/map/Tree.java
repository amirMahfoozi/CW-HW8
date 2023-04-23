package Model.gameandbattle.map;

import java.util.ArrayList;

public enum Tree {
    DESERT_SHRUB("desert shrub",null),
    OLIVE_TREE("olive tree",null),
    PALM_TREE("palm tree",null),
    COCONUT_TREE("coconut tree",null),
    CHERRY_PALM("cherry palm",null);
    private String name;
    private ArrayList<Texture> allowedTexture;

    Tree(String name, ArrayList<Texture> allowedTexture) {
        this.name = name;
        this.allowedTexture = allowedTexture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Texture> getAllowedTexture() {
        return allowedTexture;
    }

    public void setAllowedTexture(ArrayList<Texture> allowedTexture) {
        this.allowedTexture = allowedTexture;
    }
}
