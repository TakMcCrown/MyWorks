import java.util.Comparator;

public class Manager implements Employee {

    public static final int SALARY_MANAGER = 35000;
    public int random;

    public Manager(Company company){
        this.random = (int) ((Math.random() * 25000) + 115000);
    }

    @Override
    public double getMonthSalary() {
        return (int) (SALARY_MANAGER + random * 0.05);
    }

    /*@Override
    public String toString() {
        return getClass().getName() + " Ваша зп " + getMonthSalary();
    }*/

    @Override
    public String toString() {
        return Integer.toString((int) getMonthSalary());
    }
}
