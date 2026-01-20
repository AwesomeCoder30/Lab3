package edu.ucsd.spendingtracker.repository;

import java.util.List;
import edu.ucsd.spendingtracker.model.Expense;
import edu.ucsd.spendingtracker.datasource.InMemoryDataSource;

public class ExpenseRepository {
    private InMemoryDataSource dataSource;

    public ExpenseRepository(InMemoryDataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void addExpense(Expense expense){
        dataSource.addExpense(expense);
    }

    public List<Expense> getExpenses(){
        return dataSource.getExpenses();
    }

    public double getTotal(){
        double total = 0;   
        for(Expense expense : dataSource.getExpenses()){
            total += expense.getAmount();
        }
        return total;
    }
}
