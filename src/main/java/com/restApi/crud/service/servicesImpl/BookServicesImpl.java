package com.restApi.crud.service.servicesImpl;

import com.restApi.crud.pojo.Book;
import com.restApi.crud.repository.BookRepository;
import com.restApi.crud.service.BookServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServicesImpl implements BookServices {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public String insertBookDetails(Book bookInfo){
        String message="";
        try {
            System.out.println("BookName:"+bookInfo.getBookName());
            bookRepository.save(bookInfo);
            message="Details saved successfully!...";
        }catch (Exception ex){
            message = "Details not saved "+ex.getMessage()+"!...";
        }
        return message;
    }
}
