package be.vdab.application;

import be.vdab.domain.Author;
import be.vdab.domain.Post;
import be.vdab.repository.PostRepository;
import be.vdab.service.PostService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class TestPostCRUD {
    public static void main(String[] args) {

        PostRepository postRepository = new PostRepository();
        PostService postService = new PostService();
        postService.setPostRepository(postRepository);

        // test createPost
        Author klaas = new Author("Klaas","Belgium",35);
        Post postKlaas = new Post("test", "test", LocalDateTime.now(),klaas);
        //postService.createPost(postKlaas);

        // test readListAuthor
        List<Post> postList = postService.readListPosts("test");
        for (Post post : postList) {
            System.out.println(post.toString());
        }

        // test updateAuthor
        Post post = postList.get(0);
        post.setText("not a test anymore");
        //postService.updatePost(post);

        // test deleteAuthor
        //postService.deletePost(post);

    }
}
