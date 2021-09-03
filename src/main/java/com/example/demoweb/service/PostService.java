package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

@Service
public class PostService {

    static ArrayList<Post> posts = new ArrayList<Post>(createFirstPosts());

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    static Collection<Post> createFirstPosts() {
        return Arrays.asList(
                new Post("Один", new Date()),
                new Post("Два Два", new Date()),
                new Post("Три Три Три", new Date()));
    }

    public static void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
