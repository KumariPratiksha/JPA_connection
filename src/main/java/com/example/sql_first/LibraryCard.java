package com.example.sql_first;

import jakarta.persistence.*;

@Entity
@Table(name ="library_card")
public class LibraryCard {
    @Id
    private int cardNo;
    private int fine;
    private int bookIssued;
    @Enumerated(value = EnumType.STRING) // to store the values in db in string format
    private CardStatus cardStatus;

    @OneToOne
    @JoinColumn
    User user;
}
