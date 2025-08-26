package com.dcrosscapital.journalApp.entity;


import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;


//Now here we are mapping our class  and  its  field and object to the mongodb database -> this is ORM is.
//-> This means the instance of this class will be equal to the 1 document in mongoDB

@Document(collection = "journal_entries") // Yeh sab kuch jaakar journal_entries se map ho jayega
@Data //    We do not need getters and setter  to write explicitly as project Lombok will handle it at the compile time.

public class JournalEntry {

    @Id // This indicates that the primary key in the document will be our id here/
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;

}
