import java.util.ArrayList;

public interface Employee extends Comparable<Employee>{

    @Override
    default int compareTo(Employee o) {
        Employee employee = (Employee) o;
        return Integer.compare((int) getMonthSalary(), (int) employee.getMonthSalary());
    }


    double getMonthSalary();
}
