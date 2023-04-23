package Controller;

import Model.Regex.GovernmentMenuRegexes;
import Model.gameandbattle.map.Map;
import Model.gameandbattle.shop.Request;
import Model.signup_login_profile.User;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataBank {
    private static ArrayList<User> allUsers = new ArrayList<>();
    private static User currentUser;
    public static ArrayList<Map> allMaps = new ArrayList<>();
    private static ArrayList<Request> requests=new ArrayList<>();
    ///////////////////////////////////// getters and setters

    public static ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public static void setAllUsers(ArrayList<User> allUsers) {
        DataBank.allUsers = allUsers;
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User currentUser) {
        DataBank.currentUser = currentUser;
    }

    ///////////////////////////////////////////////////////
    public static User getUserByUsername(String username) {
        for (User allUser : allUsers) {
            if (allUser.getUsername().equals(username)) return allUser;
        }
        return null;
    }
}
