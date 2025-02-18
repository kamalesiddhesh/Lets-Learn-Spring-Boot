package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.ProjectConfig;
import com.example.models.Comment;
import com.example.services.CommentService;

public class App 
{
    public static void main( String[] args ){
        
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = context.getBean(CommentService.class);
        
        var comment = new Comment();
        comment.setAuthor("Siddhesh");
        comment.setText("Demo Comment");
        
        commentService.publishComment(comment);
    }
}
