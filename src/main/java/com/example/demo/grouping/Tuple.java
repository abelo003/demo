package com.example.demo.grouping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Tuple {
    private BlogPostType type;
    private String author;
}
