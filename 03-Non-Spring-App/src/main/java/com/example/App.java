package com.example;

import com.example.models.Comment;
import com.example.proxies.CommentNotificationProxy;
import com.example.proxies.EmailCommentNotificationProxy;
import com.example.repositories.CommentRepository;
import com.example.repositories.DBCommentRepository;
import com.example.services.CommentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
        
        var commentService = new CommentService(commentRepository,commentNotificationProxy);
        
        var comment = new Comment();
        comment.setAuthor("Siddhesh");
        comment.setText("Demo Comment");
        
        commentService.publishComment(comment);
    }
}
