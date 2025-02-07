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
//    @UpdateTimestamp
//    String lastIssueDate;
//    String issuedBy;
//    String issuedById;
//    String issuedToUserName;
//    String issuedToUserId;
//    String issuedToUserEmail;
}
