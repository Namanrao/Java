package com.moneycontrol.ExpenseTracker.Expense.Tracker.controller;


import com.moneycontrol.ExpenseTracker.Expense.Tracker.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HealthCheckController {


    @GetMapping("/health-check")
    public String healthcheck() {
        return "ok server is up !";
    }
}
