package com.example.repositories;

import org.springframework.stereotype.Repository;

import com.example.models.Comment;

@Repository
public class DBCommentRepository implements CommentRepository{

	public void storeComment(Comment comment) {
		System.out.println("Storing Comment : "+ comment.getText());		
	}

}
