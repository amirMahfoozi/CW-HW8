package Model.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum DropElementMenuRegexes {
    SET_A_TILE_TEXTURE(""),
    SET_A_GROUP_TEXTURE(""),
    CLEAR(""),
    DROP_ROCK(""),
    DROP_TREE(""),
    DROP_WATER(""),
    DROP_BUILDING(""),
    DROP_UNIT("");
    private String regex;

    private DropElementMenuRegexes(String regex) {
        this.regex = regex;
    }

    public Matcher getMatcher(String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher;
    }
}
