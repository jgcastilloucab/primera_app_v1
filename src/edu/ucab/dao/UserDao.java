package edu.ucab.dao;

import edu.ucab.model.User;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserDao {

    private final Map<String, User> userMap;

    public UserDao() {
        this.userMap = new HashMap<>();
        initFakeUsers();
    }
    
    private void initFakeUsers(){
        userMap.put("goyo", new User("goyo", "qwerty", 12345678, "Gregorio", "Castillo"));
        userMap.put("user1", new User("user1", "qwerty", 23456781, "Juan", "Perez"));
        userMap.put("user2", new User("user2", "qwerty", 21345621, "María", "García"));
    }

    public Optional<User> getUser(String usr){
        return Optional.ofNullable(userMap.get(usr));
    }
}
