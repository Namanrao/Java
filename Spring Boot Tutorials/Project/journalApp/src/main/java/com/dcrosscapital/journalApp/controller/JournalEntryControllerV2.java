package com.dcrosscapital.journalApp.controller;

import com.dcrosscapital.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal") // First  this will be the path then -> get mapping  will be called.
public class JournalEntryControllerV2 {


    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }

    @PostMapping
    public Boolean createEntry(@RequestBody JournalEntry myEntry){ // localhost:8080/journal POST
        return true;
    }

    @GetMapping("id/{myid}")
    public JournalEntry getJournalEntrybyId(@PathVariable Long myid){
        return null;

    }

    @DeleteMapping("id/{myid}")
    public Boolean deleteJournalEntry(@PathVariable Long myid){
        return true;
    }

    @PutMapping("id/{myid}")
    public Boolean updateJournalEntry(@PathVariable Long myid,@RequestBody JournalEntry entry){
        return true;
}
