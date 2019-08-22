package com.sudhirt.practice.springdatajdbcpractice.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;
import java.time.LocalDate;

@Data
@Builder
@Table("AUTHOR")
public class Author {

	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	@CreatedBy
	private String createdBy;
	@CreatedDate
	private Instant createdDate;
	@LastModifiedBy
	private String lastModifiedBy;
	@LastModifiedDate
	private Instant lastModifiedDate;
}
