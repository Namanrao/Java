package com.dcrosscapital.journalApp.repository;

import com.dcrosscapital.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

//@Component ---> yahan component lagane  ki zaroorat nahi hai kyuki spring-boot MongoRepository ko extend karne ke
//karan yeh automaitically component ban chuka hai.

//MongoRepository mein first parameter hai kis par operation  karna hai dusra parameter hai data type of id.
public interface JournalEntryRepository extends MongoRepository <JournalEntry, ObjectId>{

}
