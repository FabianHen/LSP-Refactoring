package expensereport;

import java.util.Date;
import java.util.List;

public class ExpenseReport {

    public void printReport(List<Expense> expenses) {
        int total = 0;
        int mealExpenses = 0;

        System.out.println("Expenses " + new Date());

        for (Expense expense : expenses) {
            if (expense.type.isMealExpense()) {
                mealExpenses += expense.amount;
            }
            ReportLine currentLine = new ReportLine(
                    expense.type.toString(),
                    expense.amount,
                    expense.getMealOverExpenseMarker()
            );
            System.out.println(currentLine);

            total += expense.amount;
        }

        System.out.println("Meal expenses: " + mealExpenses);
        System.out.println("Total expenses: " + total);
    }
}
