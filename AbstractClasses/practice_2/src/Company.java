import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Company {

    List<Employee> staff = new ArrayList<>();
/*
    Operator operator = new Operator();
    Manager manager = new Manager();
    TopManager topManager = new TopManager();

 */

    private int companyIncome;

    public Company(int companyIncome) {
        this.companyIncome = companyIncome;
    }

    public void hire(Employee employee){
        staff.add(employee);
    }

    public void hireAll(ArrayList<Employee> employee){
        ArrayList<Employee> employees = employee;
        for (Employee e : employees){
            staff.add(e);
        }
    }

    public void fire(Employee employee){
        staff.remove(employee);
    }

    public void remove(){
        System.out.println("До увольнения " + staff.size());
        for (int i = 0; i < staff.size(); i++){
            fire(staff.get(i));
        }
        System.out.println("После увольнения " + staff.size());
    }

    public void addEmployee(int countOperator, int countManager, int countTopManager, Company company){
        for (int i = 0; i < countOperator; i++){
            hire(new Operator(company));
        }
        for (int i = 0; i < countManager; i++){
            hire(new Manager(company));
        }
        for (int i = 0; i < countTopManager; i++){
            hire(new TopManager(company));
        }
    }

    public int getIncome(){
        return companyIncome;
    }


    public List<Employee> getTopSalaryStaff(int count){
        Collections.sort(staff);
        Collections.reverse(staff);
        for (int i = 0; i < count; i++) {
            System.out.println("Самая высокая зарплата - " + i + " - " + staff.get(i) + " руб.");
        }
        return new ArrayList<>();
    }

    public List<Employee> getLowestSalaryStaff(int count){
        Collections.sort(staff);
        for (int i = 0; i < count; i++) {
            System.out.println("Самая низкая зарплата - " + i + " - " + staff.get(i) + " руб.");
        }
        return new ArrayList<>();
    }



}
