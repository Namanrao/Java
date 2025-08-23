package com.dcrosscapital.journalApp.controller;

import com.dcrosscapital.journalApp.entity.JournalEntry;
import com.dcrosscapital.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@RestController // ----- yahan par RestController already laga hua hai toh @Component ki zarurat nahi hai.

@RequestMapping("/journal") // First  this will be the path then -> get mapping  will be called.

public class JournalEntryControllerV2 {


    @Autowired
    private JournalEntryService journalEntryService;


    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry) { // localhost:8080/journal POST
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);  //----> This is what ORM is .
        return myEntry;
    }


    @GetMapping("id/{myid}")
    public JournalEntry getjournalEntrybyid(@PathVariable ObjectId myid) {
        return journalEntryService.findById(myid).orElse(null);
    }


    @DeleteMapping("id/{myid}")
    public boolean deleteJournalEntry(@PathVariable ObjectId myid) {
        journalEntryService.deleteById(myid);
        return true;
    }


    @PutMapping("id/{myid}")
    public JournalEntry updateJournalEntry(@PathVariable ObjectId myid, @RequestBody JournalEntry newEntry) {
        JournalEntry old =  journalEntryService.findById(myid).orElse(null);
        if(old!=null){
            old.setTitle(newEntry.getTitle()!=null && !newEntry.getTitle().isEmpty()?newEntry.getTitle(): old.getTitle());
            old.setContent(newEntry.getContent()!=null && !newEntry.getContent().isEmpty()?newEntry.getContent(): old.getContent());
        }
        journalEntryService.saveEntry(old);  //----> This is what ORM is .
        return old;
    }
}

