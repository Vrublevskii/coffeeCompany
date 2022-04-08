package com.coffeecompany.data;

import com.coffeecompany.entities.User;

import java.util.ArrayList;
import java.util.List;


public class UserData {

    static List<User> users = new ArrayList<>();

    static {
        User user1 = new User("MyName", "1234");
        User user2 = new User("MyNameV", "1234");
        users.add(user1);
        users.add(user2);
    }

    public static List<User> getUsers() {
        return users;
    }

}
