package Model.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ShopMenuRegexes {
    SHOW_PRICE_LIST(""),
    BUY(""),
    SELL("");
    private String regex;

    private ShopMenuRegexes(String regex) {
        this.regex = regex;
    }

    public Matcher getMatcher(String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher;
    }
}
