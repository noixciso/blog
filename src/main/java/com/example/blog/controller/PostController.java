package com.example.blog.controller;

import com.example.blog.service.impl.MemPostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//файл PostController обрабатывает пользовательские запросы
@Controller //аннотацией @Сontroller мы даём понять спрингу что этот файл обрабатывает польз.запросы
public class PostController {

    private final MemPostService memPostService;
    public PostController(MemPostService memPostService){
        this.memPostService = memPostService;
    }

    @GetMapping("/") //этой аннотацией указывается урл где будет выводиться информация в методе
     //@ResponseBody //эта аннотация нужна для того чтобы при запуске отдавался не html файл, а именно то что указано в методе
    public String hello(Model model, @RequestParam(required = false) String query) {
        model.addAttribute("posts", memPostService.search(query));
        return "hello";
    }
}