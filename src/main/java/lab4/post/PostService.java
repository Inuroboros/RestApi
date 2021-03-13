package com.example.lab4.post;

import com.example.lab4.location.Location;
import com.example.lab4.user.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    Location l1 = new Location("l1", "Astana");
    Location l2 = new Location("l2", "Almaty");

    User u1 = new User("u1", "Jany", "Lawrence", l1, "Jany@gmail.com");
    User u2 = new User("u2", "Jadon", "Mills", l2, "Jadon@gmail.com");

    List<Post> posts = new ArrayList<>(Arrays.asList(
            new Post("p1", "01-Jan-19", u1, "It's good to love and be loved"),
            new Post("p2", "02-Jan-19", u2, "We all need someone")
    ));

    public List<Post> getAllPosts() {
        return posts;
    }

    public Post getPost(String id) {
        return posts.stream().filter(p -> id.equals(p.getId())).findFirst().orElse(null);
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void updatePost(String id, Post post) {
        for (int i = 0; i < posts.size(); i++) {
            Post p = posts.get(i);
            if (p.getId().equals(id))
                posts.set(i, post);
        }
    }

    public void deletePost(String id) {
        posts.removeIf(p -> p.getId().equals(id));
    }
}
