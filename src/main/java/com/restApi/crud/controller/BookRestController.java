package com.restApi.crud.controller;

import com.restApi.crud.pojo.Book;
import com.restApi.crud.service.BookServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/bookServices")
public class BookRestController {
    @Autowired
    private BookServices bookServices;
    //Create Book Details rest api;
    @PostMapping("/createBookDetails")
    public String insertBookDetails(@RequestBody Book book){
        //String message = bookServices.insertBookDetails(book);
        return bookServices.insertBookDetails(book);
    }
}
