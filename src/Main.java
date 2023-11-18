import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> personList = new ArrayList<>(Arrays.asList(
                new Employee(3297, List.of("89234357273"), "Светлана Андреевна", 5),
                new Employee(1345, List.of("89138498877"), "Пётр Николаевич", 10),
                new Employee(1597, List.of("89095430571", "89192320102"), "Валентина Александровна", 10),
                new Employee(4298, List.of("89139492214", "89095440108"), "Андрей Ильич", 15),
                new Employee(7321, List.of("89234352871"), "Семён Викторович", 3)));
        HRbook hRbook = new HRbook(personList);

        Printer.print(hRbook.findByExperience(10));
        System.out.println("Номера телефонов искомого сотрудника: " + hRbook.findPhoneByName("Андрей Ильич").toString());
        Printer.print(hRbook.findByServiceNum(7321));

        hRbook.addEmployee(new Employee(2002, List.of("89138932293", "89095430277"), "Иван Николаевич", 0));
        Printer.print(hRbook.getPersonList());
    }
}