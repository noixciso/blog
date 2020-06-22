package com.example.blog.service.impl;

import com.example.blog.dto.Post;
import com.example.blog.service.api.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemPostService implements PostService {

    private ArrayList<Post> posts = new ArrayList<>(Arrays.asList(
            Post.builder().title("First title").body("First body").img("/img/1.jpg").build(),
            Post.builder().title("Second title").body("Second body").img("/img/2.jpg").build(),
            Post.builder().title("Third title").body("Third body").img("/img/3.jpg").build())
    );

    @Override
    public List<Post> search(String query) {
        return query != null && !query.isEmpty() ?
                posts.stream().filter(post ->
                        post.getTitle().toLowerCase().matches(".*" + query.toLowerCase() + ".*")
                ).collect(Collectors.toList())
                :
                posts;
    }

}
