package com.dcrosscapital.journalApp.service;


//The Service package contains the business logic of the  product / project


import com.dcrosscapital.journalApp.entity.JournalEntry;
import com.dcrosscapital.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service //----->Yahan component use karna important hai because iska bean automatically nahi nabenga
public class JournalEntryService {

    //Now here you might think that if JournalEntryRepository is an interface where is its implementation?
//    Spring-Boot implements this interface automatically during the runtime and its object is presented to you

    @Autowired  //Another Example of dependency injection
    private JournalEntryRepository journalEntryRepository;


    //    To save the incoming entry
    public void saveEntry(JournalEntry journalEntry) {
        journalEntryRepository.save(journalEntry);

    }

    //    To get all the existing entries in the database
    public List<JournalEntry> getAll() {
        return journalEntryRepository.findAll();
    }

    //    To get the entries by id
    public Optional<JournalEntry> findById(ObjectId id) {
        return journalEntryRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        journalEntryRepository.deleteById(id);

    }
}
//This is the  general logic of the backend.
//controller ------> service --------> repository
