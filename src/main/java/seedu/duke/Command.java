package seedu.duke;

import java.io.IOException;

import Storage.Storage;

public abstract class Command {


    public abstract void execute(ExpenseManager expenses, UI ui, Storage storage) throws ExpensiveLehException, IOException;
}
