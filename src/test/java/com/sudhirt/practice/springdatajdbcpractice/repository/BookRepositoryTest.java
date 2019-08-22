package com.sudhirt.practice.springdatajdbcpractice.repository;

import com.sudhirt.practice.springdatajdbcpractice.entity.Author;
import com.sudhirt.practice.springdatajdbcpractice.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTest {

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private BookRepository bookRepository;

	@Test
	public void createBookWithAuthor() {
		Author author = Author.builder()
				.firstName("John")
				.lastName("Miller")
				.dateOfBirth(LocalDate.of(1972, 03, 01))
				.build();
		authorRepository.save(author);

		Book book = Book.builder()
				.name("My Book")
				.isbn("ISBN1234")
				.publishedDate(LocalDate.of(2018, 12, 12))
				.price(12.99)
				.build();
		book.addAuthor(authorRepository.save(author));
		bookRepository.save(book);

		assertThat(book.getId()).isNotNull();

		//Book savedBook = bookRepository.findById(book.getId()).orElseThrow(RuntimeException::new);
		bookRepository.findAll();
		//assertThat(savedBook.getAuthorRefList()).size().isEqualTo(1);
	}
}
