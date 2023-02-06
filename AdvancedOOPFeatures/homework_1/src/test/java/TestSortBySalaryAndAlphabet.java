import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@DisplayName("Сортировка по заработной плате и алфавиту")
public class TestSortBySalaryAndAlphabet {

    @Test
    @DisplayName("Входные данные - staff.txt")
    void sort() {
        List<EmployeeOOP> actualStaff = EmployeeOOP.loadStaffFromFile("AdvancedOOPFeatures/homework_1/data/staff.txt");
        List<EmployeeOOP> expectedStaff = EmployeeOOP.loadStaffFromFile("AdvancedOOPFeatures/homework_1/data/sortedStaff.txt");
        MainOOP.sortBySalaryAndAlphabet(actualStaff);
        assertIterableEquals(expectedStaff, actualStaff, "сортировка выполнена не по условию");
    }

}
