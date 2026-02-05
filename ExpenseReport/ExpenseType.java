package expensereport;

public enum ExpenseType {
    DINNER("Dinner", 5000, true),
    BREAKFAST("Breakfast", 1000, true),
    CAR_RENTAL("Car Rental", 0, false),
    LUNCH("Lunch", 2000, true);

    private final String expenseName;
    private final int expenseLimit;
    private final boolean isMealExpense;

    ExpenseType(String expenseName,int expenseLimit, boolean isMealExpense){
        this.expenseName = expenseName;
        this.expenseLimit = expenseLimit;
        this.isMealExpense = isMealExpense;
    }

    public int getExpenseLimit() {
        return expenseLimit;
    }

    public boolean isMealExpense() {
        return isMealExpense;
    }

    @Override
    public String toString() {
        return expenseName;
    }
}
