package View.menus;

import Controller.GovernmentMenuController;
import Model.Regex.GovernmentMenuRegexes;
import Model.gameandbattle.Government;

import java.util.Scanner;
import java.util.regex.Matcher;

public class GovernmentMenu {
    private final GovernmentMenuController governmentMenuController = new GovernmentMenuController();

    public void run(Scanner scanner, Government government) {
        String command;
        Matcher matcher;
        while (true) {
            command = scanner.nextLine();
            if (command.matches("show\\s+popularity\\s+factors"))
                System.out.println(governmentMenuController.showPopularityFactors(government));
            if (command.matches("show\\s+popularity"))
                System.out.println(governmentMenuController.showPopularity(government));
            if ((matcher = GovernmentMenuRegexes.getMatcher(command, GovernmentMenuRegexes.CHANGE_FOOD_RATE)) != null) {
                governmentMenuController.changeFoodRate(matcher, government);
                System.out.println("successful");
            }
            if (command.equals("food\\s+rate\\s+show"))
                System.out.println(governmentMenuController.showFoodRate(government));
            if (command.matches("show\\s+food\\s+list"))
                System.out.println(governmentMenuController.showFoodList(government));
            if ((matcher = GovernmentMenuRegexes.getMatcher(command, GovernmentMenuRegexes.CHANGE_TAX_RATE)) != null) {
                governmentMenuController.changeTaxRate(government, matcher);
                System.out.println("successful");
            }
            if (command.matches("tax\\s+rate\\s+show"))
                System.out.println(governmentMenuController.showTaxRate(government));
            if ((matcher = GovernmentMenuRegexes.getMatcher(command, GovernmentMenuRegexes.CHANGE_FEAR_RATE)) != null) {
                System.out.println("successful");
                governmentMenuController.changeFearRate(government, matcher);
            }
        }
    }
}
