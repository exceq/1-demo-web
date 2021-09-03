package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts() {
        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(new Post("Один", new Date()));
        posts.add(new Post("Два Два", new Date()));
        posts.add(new Post("Три Три Три", new Date()));
        return posts;
    }
}
