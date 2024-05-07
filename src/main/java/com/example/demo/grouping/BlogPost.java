package com.example.demo.grouping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class BlogPost {
    private String title;
    private String author;
    private BlogPostType type;
    private int likes;
}

enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}