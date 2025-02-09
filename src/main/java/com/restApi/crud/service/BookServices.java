package com.restApi.crud.service;

import com.restApi.crud.pojo.Book;

import java.util.List;

public interface BookServices {
    String insertBookDetails(Book bookDetails);
    public Book getBookDetailsByBookId(Long BookId);
    public List<Book> getAllBookDetails();
    public Book updateBookDetails(Book book);
    public List<Book> deleteBookDetails(Long bookId);
}
