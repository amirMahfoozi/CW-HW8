package Controller;

import java.util.regex.Matcher;

import Model.Regex.MapMenuRegexes;
import Model.gameandbattle.battle.Person;
import Model.gameandbattle.map.Cell;
import Model.gameandbattle.map.Map;

public class MapMenuController {
    private int currentX;
    private int currentY;

    public String showMap(Map currentMap, Matcher matcher) {
        int x = Integer.parseInt(matcher.group("y"));
        int y = Integer.parseInt(matcher.group("x"));
        currentX = x;
        currentY = y;
        return showMapWithXY(currentMap, x, y);
    }

    public String showMapWithXY(Map currentMap, int x, int y) {
        String ANSI_RESET = "\u001B[0m";
        String colorCode;
        /*String ANSI_RED = "\u001b[31m";
        String ANSI_BLUE = "\u001b[34m";
        String ANSI_GREEN = "\u001b[32m";*/
        StringBuilder result = new StringBuilder();
        if (!isCoordinateValid(x, y, currentMap.getSize()))
            return "invalid coordinate";
        for (int i = x - 20; i <= x + 20; i++) {
            for (int j = 0; j < 43; j++) {
                result.append("-");
            }
            result.append("\n");
            if (i >= 0 && i < currentMap.getSize()) {
                for (int j = y - 3; j <= y + 3; j++) {
                    colorCode = getColorCode(currentMap.getMapCells()[x][y]);
                    result.append("|").append(colorCode).append("#####").append(ANSI_RESET);
                }
                result.append("|\n");
                for (int j = y - 3; j <= y + 3; j++) {
                    if (j >= 0 && j < currentMap.getSize()) {
                        colorCode = getColorCode(currentMap.getMapCells()[x][y]);
                        result.append("|").append(colorCode).append(currentMap.getMapCells()[x][y].getToPrint()).append(ANSI_RESET);
                    }
                }
                result.append("|\n");
                for (int j = y - 3; j <= y + 3; j++) {
                    colorCode = getColorCode(currentMap.getMapCells()[x][y]);
                    result.append("|").append(colorCode).append("#####").append(ANSI_RESET);
                }
                result.append("|\n");
            }
        }
        for (int j = 0; j < 43; j++) {
            result.append("-");
        }
        return result.toString();
    }

    public String showAllOfMapWithXY(Map currentMap, int x, int y) {
        String ANSI_RESET = "\u001B[0m";
        String colorCode;
        /*String ANSI_RED = "\u001b[31m";
        String ANSI_BLUE = "\u001b[34m";
        String ANSI_GREEN = "\u001b[32m";*/
        StringBuilder result = new StringBuilder();
        if (!isCoordinateValid(x, y, currentMap.getSize()))
            return "invalid coordinate";
        for (int i = x - 95; i <= x + 95; i++) {
            if (i >= 0 && i < currentMap.getSize()) {
                for (int j = y - 95; j <= y + 95; j++) {
                    if (j >= 0 && j < currentMap.getSize()) {
                        colorCode = getColorCode(currentMap.getMapCells()[x][y]);
                        result.append(colorCode).append(currentMap.getMapCells()[x][y].getToPrint()).append(ANSI_RESET);
                    }
                }
                result.append("|\n");
            }
        }
        return result.toString();
    }

    public String getColorCode(Cell cell) {
        if (cell.getTexture().getName().equals("water"))
            return "\u001B[44m";
        if (cell.getTexture().getName().matches(".*grass.*"))
            return "\u001B[42m";
        return "\u001B[41m";
    }

    public String moveMap(Map currentMap, String command) {
        Matcher matcherUp = MapMenuRegexes.getMatcher(command, MapMenuRegexes.UP);
        Matcher matcherDown = MapMenuRegexes.getMatcher(command, MapMenuRegexes.DOWN);
        Matcher matcherRight = MapMenuRegexes.getMatcher(command, MapMenuRegexes.RIGHT);
        Matcher matcherLeft = MapMenuRegexes.getMatcher(command, MapMenuRegexes.LEFT);
        int deltaY = 0, deltaX = 0;
        deltaX = getCoordinateChanges(matcherUp, matcherDown, deltaX);
        deltaY = getCoordinateChanges(matcherRight, matcherLeft, deltaY);
        currentX += deltaX;
        currentY += deltaY;
        return showMapWithXY(currentMap, currentX, currentY);
    }

    private int getCoordinateChanges(Matcher matcherRight, Matcher matcherLeft, int delta) {
        if (matcherRight != null) {
            if (matcherRight.group("number") != null)
                delta += Integer.parseInt(matcherRight.group("number"));
            else
                delta += 1;
        }
        if (matcherLeft != null) {
            if (matcherLeft.group("number") != null)
                delta -= Integer.parseInt(matcherLeft.group("number"));
            else
                delta -= 1;
        }
        return delta;
    }

    public String showDetails(Map currentMap, Matcher matcher) {
        int x = Integer.parseInt(matcher.group("y"));
        int y = Integer.parseInt(matcher.group("x"));
        Cell cell = currentMap.getACell(x, y);
        StringBuilder result = new StringBuilder();
        result.append("texture: ").append(cell.getTexture().getName()).append("\n");
        if (cell.isDitch())
            result.append("this cell is ditch\n");
        if (cell.isPartOfTunnel())
            result.append("under this cell is a tunnel\n");
        if (cell.hasStair()) {
            result.append("stair\n").append("level: ").append(cell.getStair().getLevel());
            result.append(" hp: ").append(cell.getStair().getHitpoint()).append("\n");
        }
        if (cell.hasWall()) {
            result.append("wall\n").append("hp: ").append(cell.getWall().getHitpoint());
            result.append(" length: ").append(cell.getWall().getLength()).append("\n");
        }
        if (cell.getBuilding() != null) {
            result.append("building: ").append(cell.getBuilding().getName());
            result.append(" hp: ").append(cell.getBuilding().getHitpoint());
            result.append(" color: ").append(cell.getBuilding().getGovernment().getColor()).append("\n");
        }
        if (cell.getPeople().size() != 0) {
            result.append("people:\n");
            int personCounter = 0;
            for (Person person : cell.getPeople()) {
                personCounter++;
                result.append(personCounter).append(") ").append(person.getName());
                result.append(" color: ").append(person.getGovernment().getColor());
                result.append(" hp: ").append(person.getHp()).append("\n");
            }
            if (cell.getTree() != null)
                result.append("tree: ").append(cell.getTree().getName()).append("\n");
        }
        return result.toString();
    }

    private boolean isCoordinateValid(int x, int y, int mapSize) {
        return x >= 0 && y >= 0 && x < mapSize && y < mapSize;
    }
}
