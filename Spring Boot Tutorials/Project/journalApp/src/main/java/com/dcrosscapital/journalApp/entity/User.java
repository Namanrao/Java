package com.dcrosscapital.journalApp.entity;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


//Now here we are mapping our class  and  its  field and object to the mongodb database -> this is ORM is.
//-> This means the instance of this class will be equal to the 1 document in mongoDB

@Document(collection = "users") // Yeh sab kuch jaakar journal_entries se map ho jayega
@Data //    We do not need getters and setter  to write explicitly as project Lombok will handle it at the compile time.

public class User {

    @Id
    private ObjectId id;

    @Indexed(unique = true)
    private String userName;
    private String passWord;

}
