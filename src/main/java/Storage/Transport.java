package Storage;

public class Transport extends Expense {

    public Transport(String description, double amount) {
        super(description, amount);
    }

    @Override
    public String getCategory() {
        return "Transport";
    }
}

