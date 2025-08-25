package com.dcrosscapital.journalApp.controller;

import com.dcrosscapital.journalApp.entity.JournalEntry;
import com.dcrosscapital.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.*;

@RestController // ----- yahan par RestController already laga hua hai toh @Component ki zarurat nahi hai.

@RequestMapping("/journal") // First  this will be the path then -> get mapping  will be called.

public class JournalEntryControllerV2 {


    @Autowired
    private JournalEntryService journalEntryService;


    @GetMapping
    public ResponseEntity<?> getAllEntries(){
        List<JournalEntry>  all = journalEntryService.getAll();
        if(all != null){
            return new ResponseEntity<>(all, HttpStatus.OK);
        }
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<JournalEntry> createEntry(@RequestBody JournalEntry myEntry) {
        try {
            // localhost:8080/journal POST
            myEntry.setDate(LocalDateTime.now());
            journalEntryService.saveEntry(myEntry);  //----> This is what ORM is .
            return new ResponseEntity<>(myEntry,HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping("id/{myId}")
    public ResponseEntity<JournalEntry> getjournalEntrybyid(@PathVariable ObjectId myId) {
        Optional<JournalEntry> journalEntry = journalEntryService.findById(myId);
        if(journalEntry.isPresent()){
            return new ResponseEntity<>(journalEntry.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }


    @DeleteMapping("id/{myid}")
    public ResponseEntity<?> deleteJournalEntry(@PathVariable ObjectId myid) {
        journalEntryService.deleteById(myid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT.);
    }


    @PutMapping("id/{myid}")
    public ResponseEntity<?>  updateJournalEntry(@PathVariable ObjectId myid, @RequestBody JournalEntry newEntry) {
        JournalEntry old =  journalEntryService.findById(myid).orElse(null);
        if(old!=null){
            old.setTitle(newEntry.getTitle()!=null && !newEntry.getTitle().isEmpty()?newEntry.getTitle(): old.getTitle());
            old.setContent(newEntry.getContent()!=null && !newEntry.getContent().isEmpty()?newEntry.getContent(): old.getContent());
            journalEntryService.saveEntry(old);  //----> This is what ORM is .
            return new  ResponseEntity<>(old, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

