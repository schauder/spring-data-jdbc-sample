package com.sudhirt.practice.springdatajdbcpractice.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("BOOK_AUTHOR")
public class AuthorRef {

	@Id
	private Long author;
}
