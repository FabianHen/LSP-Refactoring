package expensereport;

public class Expense {
    ExpenseType type;
    int amount;

    public String getMealOverExpenseMarker() {
        if(type.isMealExpense() && amount > type.getExpenseLimit()){
            return "X";
        }
        return " ";
    }
}
