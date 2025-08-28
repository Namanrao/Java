package com.moneycontrol.ExpenseTracker.Expense.Tracker.controller;


import com.moneycontrol.ExpenseTracker.Expense.Tracker.model.Item;
import com.moneycontrol.ExpenseTracker.Expense.Tracker.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")

public class ItemController {

    @Autowired
    private ItemService itemservice;
    
    @PostMapping
    public boolean addItem(@RequestBody Item item) {
        return itemservice.addItem(item);
    }

    @GetMapping
    public List<Item> getItems() {
        return itemservice.getAll();
    }

    @GetMapping("/id/{myid}")
    public Optional<?> getbyid(@PathVariable long myid) {
        return itemservice.getbyid(myid);
    }

    @PutMapping("/id/{myid}")
    public Item updateItems(@PathVariable long myid, @RequestBody Item newitem) {
        return itemservice.updateById(myid, newitem);
    }

    @DeleteMapping("/id/{myid}")
    public boolean deleteItem(@PathVariable long myid) {
        return itemservice.delete(myid);
    }
}
