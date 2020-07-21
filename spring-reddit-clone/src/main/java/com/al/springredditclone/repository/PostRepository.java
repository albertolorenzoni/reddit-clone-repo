package com.al.springredditclone.repository;

import com.al.springredditclone.model.Post;
import com.al.springredditclone.model.Subreddit;
import com.al.springredditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
