package Storage;

public class Groceries extends Expense {

    public Groceries(String description, double amount) {
        super(description, amount);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}

