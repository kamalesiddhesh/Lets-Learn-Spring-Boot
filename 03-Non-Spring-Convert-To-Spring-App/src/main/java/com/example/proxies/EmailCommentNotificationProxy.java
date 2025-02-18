package com.example.proxies;

import org.springframework.stereotype.Component;

import com.example.models.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

	public void sendComment(Comment comment) {
		System.out.println("Sending Notification for comment : " + comment.getText());		
	}
	

}
