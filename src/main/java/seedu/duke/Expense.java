package seedu.duke;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Expense extends Storage.Expense {
    protected LocalDate date;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Expense(String description, double amount, LocalDate date) {
        super(description, amount);
        this.date = date;
    }

    public Expense(String description, double amount) {
        this(description, amount, LocalDate.now());
    }

    public LocalDate getDate() {
        return date;
    }

    public String getFormattedDate() {
        return date.format(FORMATTER);
    }

    @Override
    public abstract String getCategory();

    @Override
    public String toString() {
        return getCategory() + " | " + description + " | $" + String.format("%.2f", amount)
                + " | " + getFormattedDate();
    }
}


