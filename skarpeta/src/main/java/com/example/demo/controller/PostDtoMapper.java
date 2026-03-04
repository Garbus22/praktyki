package com.example.demo.controller;

import com.example.demo.controller.dto.PostDto;
import com.example.demo.model.Post;

import java.util.List;
import java.util.stream.Collectors;

public class PostDtoMapper {

    private PostDtoMapper(){

    }

    public static List<PostDto> mapToPostDtos(List<Post> posts){
        return posts.stream().map(post -> mapToPostDtos(post)).collect(Collectors.toList());
    }

    private static PostDto mapToPostDtos(Post post){
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .created(post.getCreated())
                .build();
    }
}
