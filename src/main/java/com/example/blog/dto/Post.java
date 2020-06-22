package com.example.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder //добавляет в класс реализацию паттерна builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private String title;
    private String body;
    private String img;
}
