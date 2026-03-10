package seedu.duke;

import Storage.Storage;
import java.io.IOException;

public class ExitCommand extends Command {
    @Override
    public void execute(ExpenseManager expenses, UI ui, Storage storage) throws ExpensiveLehException, IOException {
        ui.showMessage("Bye!");
    }
}
