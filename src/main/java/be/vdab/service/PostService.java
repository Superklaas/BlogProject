package be.vdab.service;

import be.vdab.domain.Author;
import be.vdab.domain.Post;
import be.vdab.repository.AuthorRepository;
import be.vdab.repository.PostRepository;

import java.util.List;

public class PostService {

    PostRepository postRepository;

    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void createPost(Post post) {
        postRepository.createPost(post);
    }

    public Post readOnePost(int id) {
        Post post = postRepository.readOnePost(id);
        return post;
    }

    public List<Post> readListPosts(String title) {
        List<Post> postList = postRepository.readListPosts(title);
        return postList;
    }

    public void updatePost(Post post) {
        postRepository.updatePost(post);
    }

    public void deletePost(Post post) {
        postRepository.deletePost(post);
    }

}
