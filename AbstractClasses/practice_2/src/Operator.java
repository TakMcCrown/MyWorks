public class Operator implements Employee{

    public static final int SALARY_OPERATOR = 30000;

    public Operator(Company company) {
    }

    @Override
    public double getMonthSalary() {
        return (int) (SALARY_OPERATOR);
    }

    @Override
    public String toString() {
        return Integer.toString((int) getMonthSalary());
    }
}
