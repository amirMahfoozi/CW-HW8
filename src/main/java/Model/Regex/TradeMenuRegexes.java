package Model.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum TradeMenuRegexes {
    TRADE("trade\\s+\\-t\\s+(?<type>\\S+)\\s+\\-a(?<amount>\\d+)\\s+\\-p(?<price>\\d+)\\s+\\-m(?<message>.+)"),
    ACCEPT_TRADE("trade accept .+");
    private String regex;

    private TradeMenuRegexes(String regex) {
        this.regex = regex;
    }

    public Matcher getMatcher(String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher;
    }
}
