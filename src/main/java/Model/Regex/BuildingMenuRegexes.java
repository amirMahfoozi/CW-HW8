package Model.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum BuildingMenuRegexes {
    DROP_BUILDING(""),
    SELECT_BUILDING(""),
    CREATE_UNIT(""),
    REPAIR("");

    private String regex;

    private BuildingMenuRegexes(String regex) {
        this.regex = regex;
    }

    public Matcher getMatcher(String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher;
    }
}
