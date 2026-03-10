package Storage;

public class Others extends Expense {

    public Others(String description, double amount) {
        super(description, amount);
    }

    @Override
    public String getCategory() {
        return "Others";
    }
}

