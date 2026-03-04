package com.example.demo.service;

import com.example.demo.model.Comment;
import com.example.demo.model.Post;
import org.springframework.data.domain.Pageable;
import com.example.demo.repository.CommentRepository;
import com.example.demo.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    private static final int PAGE_SIZE = 20;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public List<Post> getPosts(int page, Sort.Direction sort){
        return postRepository.findAllPosts((Pageable) PageRequest.of(page , PAGE_SIZE, Sort.by(sort, "id")));
    }

    public Post getSinglePost(Long id){
        return postRepository.findById(id).orElseThrow();
    }

    public List<Post> getPostWithComments(int page, Sort.Direction sort){
        List<Post> allPosts = postRepository.findAllPosts((Pageable) PageRequest.of(page , PAGE_SIZE, Sort.by(sort, "id")));
        List<Long> ids = allPosts.stream().map(Post::getId).collect(Collectors.toList());
        List<Comment> comments = commentRepository.findAllByPostIdIn(ids);
        allPosts.forEach(post -> post.setComment(extractComments(comments, post.getId())));
        return allPosts;
    }

    private List<Comment> extractComments(List<Comment> comments, Long id) {
        return comments.stream()
                .filter(comment -> comment.getPost() != null && id.equals(comment.getPost().getId()))
                .collect(Collectors.toList());
    }

    public Post addPost(Post post){
        return postRepository.save(post);
    }

    @Transactional
    public Post editPost(Post post){
        Post postEdited = postRepository.findById(post.getId()).orElseThrow();
        postEdited.setTitle(post.getTitle());
        postEdited.setContent(post.getContent());
        return postEdited;
    }

    public void deletePost(Long id){
        postRepository.deleteById(id);
    }
}
