package View.menus;

import Controller.MapMenuController;
import Model.Regex.MapMenuRegexes;
import Model.gameandbattle.map.Map;

import java.util.Scanner;
import java.util.regex.Matcher;

public class MapMenu {
    private final MapMenuController mapMenuController = new MapMenuController();

    public void run(Scanner scanner, Map currentMap) {
        String command;
        Matcher matcher;
        while (true) {
            command = scanner.nextLine();
            if ((matcher = MapMenuRegexes.getMatcher(command, MapMenuRegexes.SHOW_MAP)) != null)
                System.out.println(mapMenuController.showMap(currentMap, matcher));
            if ((matcher = MapMenuRegexes.getMatcher(command, MapMenuRegexes.SHOW_DETAILS)) != null)
                System.out.println(mapMenuController.showDetails(currentMap, matcher));
            if (MapMenuRegexes.getMatcher(command, MapMenuRegexes.MOVE_MAP) != null)
                System.out.println(mapMenuController.moveMap(currentMap, command));
            else
                System.out.println("invalid command");
        }
    }
}
