package be.vdab.application;

import be.vdab.domain.Author;
import be.vdab.domain.Post;
import be.vdab.repository.AuthorRepository;
import be.vdab.repository.PostRepository;
import be.vdab.service.AuthorService;
import be.vdab.service.PostService;

import java.time.LocalDateTime;
import java.util.List;

public class TestCRUD {
    public static void main(String[] args) {

        AuthorRepository authorRepository = new AuthorRepository();
        AuthorService authorService = new AuthorService();
        authorService.setAuthorRepository(authorRepository);

        PostRepository postRepository = new PostRepository();
        PostService postService = new PostService();
        postService.setPostRepository(postRepository);

        // test createAuthor
        Author klaas = new Author("Klaas","Belgium",35);
        authorService.createAuthor(klaas);

        // test readListAuthors
        List<Author> authorList = authorService.readListAuthors("klaas");
        for (Author author : authorList) {
            System.out.println(author.toString());
        }

        // test updateAuthor
        Author author = authorList.get(0);
        author.setAge(36);
        authorService.updateAuthor(author);

        // test deleteAuthor
        authorService.deleteAuthor(author);

        // test createPost
        Post postKlaas = new Post("test","test",LocalDateTime.now(),authorList.get(0));
        postService.createPost(postKlaas);

        // test readListPosts
        List<Post> postList = postService.readListPosts("test");
        for (Post post : postList) {
            System.out.println(post.toString());
        }

        // test updatePost
        Post post = postList.get(0);
        post.setText("not a test anymore");
        postService.updatePost(post);

        // test deletePost
        postService.deletePost(post);


    }
}
