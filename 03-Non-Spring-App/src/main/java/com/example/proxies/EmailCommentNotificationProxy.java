package com.example.proxies;

import com.example.models.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{

	public void sendComment(Comment comment) {
		System.out.println("Sending Notification for comment : " + comment.getText());		
	}
	

}
