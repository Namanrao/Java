package com.dcrosscapital.journalApp.controller;

import com.dcrosscapital.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal") // First  this will be the path then -> get mapping  will be called.
public class JournalEntryController {

    private Map<Long,JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){   //-> localhost:8080/journal GET
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public Boolean createEntry(@RequestBody JournalEntry myEntry){ // localhost:8080/journal POST
        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }

    @GetMapping("id/{myid}")
    public JournalEntry getJournalEntrybyId(@PathVariable Long myid){
        return journalEntries.get(myid);

    }

    @DeleteMapping("id/{myid}")
    public Boolean deleteJournalEntry(@PathVariable Long myid){
        if(journalEntries.containsKey(myid)){
            journalEntries.remove(myid);
            return true;
        }
        return false;
    }

    @PutMapping("id/{myid}")
    public Boolean updateJournalEntry(@PathVariable Long myid,@RequestBody JournalEntry entry){
        if(journalEntries.containsKey(myid)){
//            first delete the existing key.
                journalEntries.remove(myid);
//                then update the map
            journalEntries.put(myid,entry);
            return true;
        }
        return false;
    }
}
