import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainOOP {

    public static final String STAFF_TXT = "AdvancedOOPFeatures/homework_1/data/staff.txt";

    public static void main(String[] args) {
        List<EmployeeOOP> staff = EmployeeOOP.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<EmployeeOOP> staff) {
        staff.sort(Comparator.comparing(EmployeeOOP::getName));
        staff.sort(Comparator.comparing(EmployeeOOP::getSalary));
        System.out.println(staff);
        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
    }
}