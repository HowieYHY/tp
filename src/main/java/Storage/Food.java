package Storage;

public class Food extends Expense {

    public Food(String description, double amount) {
        super(description, amount);
    }

    @Override
    public String getCategory() {
        return "Food";
    }
}

