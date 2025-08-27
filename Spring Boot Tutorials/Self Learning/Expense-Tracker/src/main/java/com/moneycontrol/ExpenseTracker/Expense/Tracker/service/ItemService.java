package com.moneycontrol.ExpenseTracker.Expense.Tracker.service;

import com.moneycontrol.ExpenseTracker.Expense.Tracker.model.Item;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    List<Item> ItemList = new ArrayList<>();

    //Get all the items present in the list.
    public List<Item> getAll() {
        return ItemList;
    }

    //Add any item in the list
    public Item addItem(Item item) {
        LocalDate current = LocalDate.now();
        item.setDate(current);
        ItemList.add(item);
        return item;
    }

    //    delete an item by id
    // Traditional for-loop approach
    public boolean delete(long myid) {
        for (int i = 0; i < ItemList.size(); i++) {
            if (ItemList.get(i).getId() == myid) {   // ✅ use == for primitive long
                ItemList.remove(i);
                return true;
            }
        }
        return false;
    }

    //    get an item by id
    public Item getbyid(long myid) {
        for (int i = 0; i < ItemList.size(); i++) {
            if (ItemList.get(i).getId() == myid) {
                return ItemList.get(i);
            }
        }
        return null;
    }

    //    update an item by id
    public Item updateById(long myid, Item newItem) {
        for (int i = 0; i < ItemList.size(); i++) {
            if (ItemList.get(i).getId() == myid) {
                newItem.setId(myid);  // ensure ID is preserved
                ItemList.set(i, newItem);
                return newItem;
            }
        }
        return null;
    }
}
