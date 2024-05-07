package com.example.demo.grouping;

import java.util.*;

import static java.util.stream.Collectors.*;

public class Test {

    public static void main(String[] args) {
        List<BlogPost> posts = Arrays.asList(new BlogPost("Fisrt one", "Abelo", BlogPostType.NEWS, 200),
                new BlogPost("Fisrt one", "Abelo", BlogPostType.NEWS, 200),
                new BlogPost("Second one", "Homer", BlogPostType.REVIEW, 20),
                new BlogPost("Terceo one", "Abelo", BlogPostType.NEWS, 8000),
                new BlogPost("Cuarto one", "Vengo", BlogPostType.GUIDE, 700),
                new BlogPost("Quinti one", "Simon", BlogPostType.REVIEW, 600),
                new BlogPost("Last one", "Octum", BlogPostType.GUIDE, 280));
        System.out.println("grouping by type");
        Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
                .collect(groupingBy(BlogPost::getType));
        System.out.println(postsPerType);
        System.out.println("\ngrouping by tuple");
        Map<Tuple, List<BlogPost>> postsPerTypeAuthor = posts.stream()
                .collect(groupingBy(post->new Tuple(post.getType(), post.getAuthor())));
        System.out.println(postsPerTypeAuthor);
        System.out.println("\ngrouping by Author and type");
        Map<String, Map<BlogPostType, List<BlogPost>>> collect = posts.stream()
                .collect(groupingBy(BlogPost::getAuthor, groupingBy(BlogPost::getType)));
        System.out.println(collect);
        System.out.println("\ngrouping by Type and likes average");
        Map<BlogPostType, Double> averageLikesPerType = posts.stream()
                .collect(groupingBy(BlogPost::getType, averagingInt(BlogPost::getLikes)));
        System.out.println(averageLikesPerType);
        System.out.println("\ngrouping by type and summing");
        Map<BlogPostType, Integer> likesPerType = posts.stream()
                .collect(groupingBy(BlogPost::getType, summingInt(BlogPost::getLikes)));
        System.out.println(likesPerType);
        /*Map<BlogPostType, Optional<BlogPost>> maxLikesPerPostType = posts.stream()
                .collect(groupingBy(BlogPost::getType,
                        maxBy(Collectors.co(BlogPost::getLikes))));*/
        System.out.println("\ngrouping by type and summarizing");
        Map<BlogPostType, IntSummaryStatistics> likeStatisticsPerType = posts.stream()
                .collect(groupingBy(BlogPost::getType,
                        summarizingInt(BlogPost::getLikes)));
        System.out.println(likeStatisticsPerType);
        System.out.println("\ngrouping by type and maping");
        Map<BlogPostType, String> postsPerType2 = posts.stream()
                .collect(groupingBy(BlogPost::getType,
                        mapping(BlogPost::getTitle, joining(", ", "Post titles: [", "]"))));
        System.out.println(postsPerType2);


        System.out.println("News.......");
        Map<String, String> collect1 = posts.stream()
                .collect(groupingBy(BlogPost::getAuthor,
                        mapping(BlogPost::getTitle, joining(","))));

        System.out.println(collect1);
    }

}
