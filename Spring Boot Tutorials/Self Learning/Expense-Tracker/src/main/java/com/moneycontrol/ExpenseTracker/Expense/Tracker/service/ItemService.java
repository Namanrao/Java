package com.moneycontrol.ExpenseTracker.Expense.Tracker.service;

import com.moneycontrol.ExpenseTracker.Expense.Tracker.model.Item;
import com.moneycontrol.ExpenseTracker.Expense.Tracker.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;


    //Get all the items present in the list.
    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    //Add any item in the list
    public long addItem(Item item) {
        LocalDate current = LocalDate.now();
        item.setDate(current);
        itemRepository.save(item);
        return item.getId();
    }

    //    delete an item by id
    // Traditional for-loop approach
    public boolean delete(long myid) {
//        check if the id exists in the database.
        Optional<Item> item = itemRepository.findById(myid);
        if (item.isPresent()) {
            itemRepository.deleteById(myid);
            return true;
        }
        return false;
    }

    //    get an item by id
    public Optional<Item> getbyid(long myid) {
        return itemRepository.findById(myid);
    }

    //    update an item by id
    public Item updateById(long myid, Item newItem) {
        return itemRepository.findById(myid)
                .map(existingItem -> {
                    existingItem.setDate(LocalDate.now());  // only this line
                    existingItem.setName(newItem.getName());
                    existingItem.setCategory(newItem.getCategory());
                    existingItem.setDescription(newItem.getDescription());
                    existingItem.setPrice(newItem.getPrice());
                    return itemRepository.save(existingItem);

                })
                .orElse(null);
    }
}
