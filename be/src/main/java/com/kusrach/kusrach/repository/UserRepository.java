package com.kusrach.kusrach.repository;

import com.kusrach.kusrach.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    Optional<User> findById(Long id);
    @Override
    Iterable<User> findAll();
}
