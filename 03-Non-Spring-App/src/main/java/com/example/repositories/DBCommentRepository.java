package com.example.repositories;

import com.example.models.Comment;

public class DBCommentRepository implements CommentRepository{

	public void storeComment(Comment comment) {
		System.out.println("Storing Comment : "+ comment.getText());
		
	}

}
