package be.vdab.service;

import be.vdab.domain.Comment;
import be.vdab.repository.CommentRepository;

import java.util.List;

public class CommentService {

    CommentRepository commentRepository = new CommentRepository();

    public void setCommentRepository(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void createComment(Comment comment) {
        commentRepository.createComment(comment);
    }

    public List<Comment> readListComments(String text) {
        List<Comment> commentList = commentRepository.readListComments(text);
        return commentList;
    }

    public void updateComment(Comment comment) {
        commentRepository.updateComment(comment);
    }

    public void deleteComment(Comment comment) {
        commentRepository.deleteComment(comment);
    }

}
