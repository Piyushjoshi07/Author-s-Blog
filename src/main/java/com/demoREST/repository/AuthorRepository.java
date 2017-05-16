package com.demoREST.repository;

import org.springframework.data.repository.CrudRepository;

import com.demoREST.domain.Author;



public interface AuthorRepository extends CrudRepository<Author, Long> {

}