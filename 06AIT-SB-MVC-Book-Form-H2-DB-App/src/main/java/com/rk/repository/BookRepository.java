package com.rk.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Serializable> {

}
