package be.vdab.application;

import be.vdab.domain.Author;
import be.vdab.domain.Comment;
import be.vdab.domain.Post;
import be.vdab.repository.AuthorRepository;
import be.vdab.repository.CommentRepository;
import be.vdab.repository.PostRepository;
import be.vdab.service.AuthorService;
import be.vdab.service.CommentService;
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

        CommentRepository commentRepository = new CommentRepository();
        CommentService commentService = new CommentService();
        commentService.setCommentRepository(commentRepository);

/*        // test createAuthor
        Author klaas = new Author("Klaas","Belgium",35);
        authorService.createAuthor(klaas);*/

        // test readListAuthors
        List<Author> authorList = authorService.readListAuthors("klaas");
        for (Author author : authorList) {
            System.out.println(author.toString());
        }
        Author author = authorList.get(0);

/*        // test updateAuthor
        author.setAge(36);
        authorService.updateAuthor(author);*/

/*        // test deleteAuthor
        authorService.deleteAuthor(author);*/

/*        // test createPost
        Post postKlaas = new Post("test post","test post",LocalDateTime.now(),authorList.get(0));
        postService.createPost(postKlaas);*/

        // test readListPosts
        List<Post> postList = postService.readListPosts("test");
        for(Post post : postList) {
            System.out.println(post.toString());
        }
        Post post = postList.get(0);

/*        // test updatePost
        post.setText("not a test anymore");
        postService.updatePost(post);*/

/*        // test deletePost
        postService.deletePost(post);*/

/*        // test createComment
        Comment commentKlaas = new Comment("test comment",LocalDateTime.now(),author,post);
        commentService.createComment(commentKlaas);*/

        // test readListComments
        List<Comment> commentList = commentService.readListComments("test");
        for(Comment comment : commentList) {
            System.out.println(comment.toString());
        }
        Comment comment = commentList.get(0);

/*        // test updateComment
        comment.setText("not a test anymore");
        commentService.updateComment(comment);*/

/*        //test deleteComment
        commentService.deleteComment(comment);*/

    }
}
