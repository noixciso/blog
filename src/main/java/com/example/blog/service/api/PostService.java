package com.example.blog.service.api;

import com.example.blog.dto.Post;

import java.util.List;

public interface PostService {
    List<Post> search(String query);
}
