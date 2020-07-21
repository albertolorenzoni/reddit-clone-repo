package com.al.springredditclone.repository;

import com.al.springredditclone.model.Post;
import com.al.springredditclone.model.User;
import com.al.springredditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
