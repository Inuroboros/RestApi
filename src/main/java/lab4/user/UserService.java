package com.example.lab4.user;

import com.example.lab4.location.Location;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    Location l1 = new Location("l1", "Astana");
    Location l2 = new Location("l2", "Almaty");

    List<User> users = new ArrayList<>(Arrays.asList(
            new User("u1", "Jany", "Lawrence", l1, "Jany@gmail.com"),
            new User("u2", "Jadon", "Mills", l2, "Jadon@gmail.com")
    ));

    public List<User> getAllUsers() {
        return users;
    }

    public User getUser(String id) {
        return users.stream().filter(u -> id.equals(u.getId())).findFirst().orElse(null);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(String id, User user) {
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            if (u.getId().equals(id))
                users.set(i, user);
        }
    }

    public void deleteUser(String id) {
        users.removeIf(u -> u.getId().equals(id));
    }
}
