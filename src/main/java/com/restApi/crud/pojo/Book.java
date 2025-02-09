package com.restApi.crud.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Book_Details")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long bookId;
    String bookName;
    String bookAuthor;
    String bookSubject;
    @UpdateTimestamp
    String lastIssueDate;
String issuedBy;
    String issuedById;
    String issuedToUserName;
    String issuedToUserId;

//    public String getIssuedBy() {
//        return issuedBy;
//    }
//
//    public void setIssuedBy(String issuedBy) {
//        this.issuedBy = issuedBy;
//    }
//
//    public String getIssuedById() {
//        return issuedById;
//    }
//
//    public void setIssuedById(String issuedById) {
//        this.issuedById = issuedById;
//    }
//
//    public String getIssuedToUserName() {
//        return issuedToUserName;
//    }
//
//    public void setIssuedToUserName(String issuedToUserName) {
//        this.issuedToUserName = issuedToUserName;
//    }
//
//    public String getIssuedToUserId() {
//        return issuedToUserId;
//    }
//
//    public void setIssuedToUserId(String issuedToUserId) {
//        this.issuedToUserId = issuedToUserId;
//    }
//
//    public String getIssuedToUserEmail() {
//        return issuedToUserEmail;
//    }
//
//    public void setIssuedToUserEmail(String issuedToUserEmail) {
//        this.issuedToUserEmail = issuedToUserEmail;
//    }
//
//    String issuedToUserEmail;
//
//    public Long getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(Long bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public String getBookAuthor() {
//        return bookAuthor;
//    }
//
//    public void setBookAuthor(String bookAuthor) {
//        this.bookAuthor = bookAuthor;
//    }
//
//    public String getBookSubject() {
//        return bookSubject;
//    }
//
//    public void setBookSubject(String bookSubject) {
//        this.bookSubject = bookSubject;
//    }
}
