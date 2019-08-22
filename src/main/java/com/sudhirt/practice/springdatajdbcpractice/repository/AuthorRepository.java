package com.sudhirt.practice.springdatajdbcpractice.repository;

import com.sudhirt.practice.springdatajdbcpractice.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
