package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {

    static ArrayList<Post> posts = new ArrayList<Post>(createFirstPosts());

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    static Collection<Post> createFirstPosts() {
        return Arrays.asList(
                new Post(0L,"Один", new Date()),
                new Post(1L,"Два Два", new Date()),
                new Post(2L,"Три Три Три", new Date()));
    }

    public static void create(String text) {
        posts.add(new Post((long)posts.size(), text, new Date()));
    }
}
