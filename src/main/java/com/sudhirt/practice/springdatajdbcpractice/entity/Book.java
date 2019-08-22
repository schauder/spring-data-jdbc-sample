package com.sudhirt.practice.springdatajdbcpractice.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.util.Assert;

import java.time.Instant;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@Table("BOOK")
public class Book {

	@Id
	private Long id;
	private String name;
	private String isbn;
	private Set<AuthorRef> authorRefList;
	private Double price;
	private LocalDate publishedDate;
	@CreatedBy
	private String createdBy;
	@CreatedDate
	private Instant createdDate;
	@LastModifiedBy
	private String lastModifiedBy;
	@LastModifiedDate
	private Instant lastModifiedDate;

	public void addAuthor(Author author) {
		if(authorRefList == null) {
			authorRefList = new HashSet<>();
		}
		authorRefList.add(createAuthorRef(author));
	}

	private AuthorRef createAuthorRef(Author author) {
		Assert.notNull(author, "Author must not be null");
		Assert.notNull(author.getId(), "Author id must not be null");
		AuthorRef authorRef = new AuthorRef();
		authorRef.setAuthor(author.getId());
		return authorRef;
	}
}
