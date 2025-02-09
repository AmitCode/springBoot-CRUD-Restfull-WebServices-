package com.restApi.crud.controller;

import com.restApi.crud.pojo.Book;
import com.restApi.crud.service.BookServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bookServices")
public class BookRestController {
    @Autowired
    private BookServices bookServices;
    //Create Book Details rest api;
    @PostMapping("/createBookDetails")
    @ResponseStatus(HttpStatus.CREATED)
    public String insertBookDetails(@RequestBody Book book){
        //String message = bookServices.insertBookDetails(book);
        return bookServices.insertBookDetails(book);
    }

    @GetMapping("/getSingleBookInfo")
    //@RequestHeader("bookId") for sending request using header.
    //@PathVariable("bookId") for sending request using url variable (like (url/booId))
    public Book getSingleBookInfo(@RequestHeader("bookId") Long bookId){
        Book book = bookServices.getBookDetailsByBookId(bookId);
        return new ResponseEntity<>(book,HttpStatus.OK).getBody();
    }

    @GetMapping("/getAllBookDetails")
    public ResponseEntity<List<Book>> getBookDetails(){
        List<Book> books = bookServices.getAllBookDetails();
        return new ResponseEntity<>(books,HttpStatus.OK);
    }

    @PutMapping("/updateBookDetails")
    public ResponseEntity<Book> updateBookDetails(@RequestBody Book book){
        return new ResponseEntity<>(bookServices.updateBookDetails(book),HttpStatus.OK);
    }

    @DeleteMapping("/deleteBookDetail")
    public ResponseEntity<List<Book>> deleteBookDetails(@RequestHeader("bookId") Long bookId){
        return new ResponseEntity<>(bookServices.deleteBookDetails(bookId),HttpStatus.OK);
    }
}
