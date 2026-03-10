package seedu.duke;

import java.util.ArrayList;
import java.time.LocalDate;
import Storage.Expense;

public class ExpenseManager {
    private final ArrayList<Expense> expenses;
    private double budget;

    public ExpenseManager() {
        this.expenses = new ArrayList<>();
        this.budget = 0.0;
    }

    public ExpenseManager(ArrayList<Expense> expenses, double budget) {
        this.expenses = expenses;
        this.budget = budget;
    }

    public void addExpense(seedu.duke.Expense expense) {
        expenses.add(expense);
    }

    public seedu.duke.Expense deleteExpense(int index) throws ExpensiveLehException {
        if (index < 0 || index >= expenses.size()) {
            throw new ExpensiveLehException("Expense ID " + (index + 1) + " doesn't exist.");
        }
        return (seedu.duke.Expense) expenses.remove(index);
    }

    public seedu.duke.Expense editExpense(int index, String category, String name, Double value, LocalDate date)
            throws ExpensiveLehException {
        if (index < 0 || index >= expenses.size()) {
            throw new ExpensiveLehException("Expense ID " + (index + 1) + " doesn't exist.");
        }

        seedu.duke.Expense currentExpense = (seedu.duke.Expense) expenses.get(index);
        String finalName = name != null ? name : currentExpense.getDescription();
        Double finalValue = value != null ? value : currentExpense.getAmount();
        LocalDate finalDate = date != null ? date : currentExpense.getDate();
        String finalCategory = category != null ? category : currentExpense.getCategory();

        seedu.duke.Expense newExpense;
        switch (finalCategory.toLowerCase()) {
        case "food":
            newExpense = new Food(finalName, finalValue, finalDate);
            break;
        case "transport":
            newExpense = new Transport(finalName, finalValue, finalDate);
            break;
        case "groceries":
            newExpense = new Groceries(finalName, finalValue, finalDate);
            break;
        case "others":
            newExpense = new Others(finalName, finalValue, finalDate);
            break;
        default:
            newExpense = new Others(finalName, finalValue, finalDate);
        }

        expenses.set(index, newExpense);
        return currentExpense;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double getRemainingBudget() {
        double totalExpenses = 0.0;
        for (Expense expense : expenses) {
            totalExpenses += expense.getAmount();
        }
        return budget - totalExpenses;
    }

    public seedu.duke.Expense getExpense(int index) {
        return (seedu.duke.Expense) expenses.get(index);
    }

    public int getSize() {
        return expenses.size();
    }

    public boolean isEmpty() {
        return expenses.isEmpty();
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }
}
