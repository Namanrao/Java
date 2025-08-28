package com.moneycontrol.ExpenseTracker.Expense.Tracker.repository;

import com.moneycontrol.ExpenseTracker.Expense.Tracker.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
