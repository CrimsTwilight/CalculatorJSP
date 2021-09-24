package by.crims.dao;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {
    private static final List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }

    public User getByEmail(String email){
        for (User user : users) {
            if (user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }
}