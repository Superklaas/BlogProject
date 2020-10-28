package be.vdab.service;

import be.vdab.domain.Author;
import be.vdab.domain.Post;
import be.vdab.repository.AuthorRepository;
import be.vdab.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
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

    public List<Post> readAllPosts() {
        List<Post> posts = postRepository.readAllPosts();
        return posts;
    }

    public List<Post> readListPosts(String title) {
        List<Post> posts = postRepository.readListPosts(title);
        return posts;
    }

    public void updatePost(Post post) {
        postRepository.updatePost(post);
    }

    public void deletePost(Post post) {
        postRepository.deletePost(post);
    }

}
