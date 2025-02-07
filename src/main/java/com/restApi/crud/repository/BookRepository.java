package com.restApi.crud.repository;

import com.restApi.crud.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    public List<Book> findBybookId(Long BookId);
}
