package com.gmail.vikkingg13.repos;

import com.gmail.vikkingg13.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepos extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
