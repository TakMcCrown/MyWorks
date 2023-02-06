import java.util.ArrayList;
import java.util.Collections;

public class MainCom {

    public static void main(String[] args) {
        Company company = new Company(11_000_000);
        company.addEmployee(180,80,10, company);
        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));
        company.remove();
        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));
        ArrayList<Employee> hello = new ArrayList<>();
        hello.add(new Operator(company));
        hello.add(new Manager(company));
        company.hireAll(hello);
    }
}
