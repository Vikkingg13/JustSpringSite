package com.gmail.vikkingg13.repos;

import com.gmail.vikkingg13.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
