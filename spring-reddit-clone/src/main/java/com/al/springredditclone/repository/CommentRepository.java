package com.al.springredditclone.repository;

import com.al.springredditclone.model.Comment;
import com.al.springredditclone.model.Post;
import com.al.springredditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
