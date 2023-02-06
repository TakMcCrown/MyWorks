public class TopManager implements Employee{

    public static final int SALARY_TOP_OPERATOR = 50000;
    private int income;

    public TopManager(Company company){
        this.income = company.getIncome();
    }

    @Override
    public double getMonthSalary() {
        if (income > 10_000_000){
            return (int) (SALARY_TOP_OPERATOR + (SALARY_TOP_OPERATOR * 1.5));
        } else {
            return SALARY_TOP_OPERATOR;
        }
    }

    @Override
    public String toString() {
        return Integer.toString((int) getMonthSalary());
    }
}
