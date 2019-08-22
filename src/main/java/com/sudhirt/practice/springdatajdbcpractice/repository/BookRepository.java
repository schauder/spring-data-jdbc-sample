package com.sudhirt.practice.springdatajdbcpractice.repository;

import com.sudhirt.practice.springdatajdbcpractice.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
