public class ExpenseReport {
    double january = 15000;
    double february = 23000;
    double march = 17000;

    double totalExpenseQuarter = january + february + march;
    double averageExpenses = totalExpenseQuarter / 3;

    public double getTotalExpenseQuarter() {
        return this.totalExpenseQuarter;
    }

    public double getAverageExpenses() {
        return this.averageExpenses;
    }

    public static void main(String[] args) {
        ExpenseReport expenseReport = new ExpenseReport();

        System.out.println("Total Expenses Quarter");
        System.out.println(expenseReport.getTotalExpenseQuarter());
        System.out.println("");
        System.out.println("Average Expenses");
        System.out.println(expenseReport.getAverageExpenses());

    }
}
