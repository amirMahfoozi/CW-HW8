package Model.gameandbattle.map;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Texture {
    GROUND("ground"),
    GRAVEL_GROUND("gravel ground"),
    ROCK("rock"),
    ROCKY_GROUND("rocky ground"),
    METAL("metal"),
    GRASS("grass"),
    HIGH_DENSITY_GRASSLAND("high density grassland"),
    LOW_DENSITY_GRASSLAND("low density grassland"),
    WATER("water");
    private String name;

    private Texture(String regex) {
        this.name = regex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
