package Storage;

/**
 * Abstract superclass for expenses, used by Storage.
 */
public abstract class Expense {
    protected String description;
    protected double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public abstract String getCategory();
}

