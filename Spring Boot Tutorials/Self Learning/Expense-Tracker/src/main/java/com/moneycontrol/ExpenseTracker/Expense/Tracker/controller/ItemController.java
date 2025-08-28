package com.moneycontrol.ExpenseTracker.Expense.Tracker.controller;


import com.moneycontrol.ExpenseTracker.Expense.Tracker.model.Item;
import com.moneycontrol.ExpenseTracker.Expense.Tracker.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")

public class ItemController {

    @Autowired
    private ItemService itemservice;

    @PostMapping
    public ResponseEntity<Long> addItem(@RequestBody Item item) {
        long id = itemservice.addItem(item);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Item>> getItems() {
        return new ResponseEntity<>(itemservice.getAll(), HttpStatus.OK);
    }

    @GetMapping("/id/{myid}")
    public ResponseEntity<Item> getbyid(@PathVariable long myid) {
        // Call service to fetch the item
        Optional<Item> item = itemservice.getbyid(myid);
        if (item.isPresent()) {
            return new ResponseEntity<>(item.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping("/id/{myid}")
    public ResponseEntity<?> updateItems(@PathVariable long myid, @RequestBody Item newitem) {
        Item item = itemservice.updateById(myid, newitem);
        if (item == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/id/{myid}")
    public ResponseEntity<?> deleteItem(@PathVariable long myid) {
        if (itemservice.delete(myid)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
