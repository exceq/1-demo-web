package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts() {
        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(new Post("Один", 1));
        posts.add(new Post("Два Два", 22));
        posts.add(new Post("Три Три Три", 333));
        return posts;
    }
}
