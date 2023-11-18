import java.util.List;

public class Printer {
    public static void print(List<Employee> list) {
        int count = 0;
        System.out.println("-----------------------------------------------------------\nРезультат поиска:\n");
        for (Employee employee : list) {
            System.out.println(++count + ". " + employee.getName() + ", тел." + employee.getPhoneNum() +
                    ", таб." + employee.getServiceNum() + ", стаж - " + employee.getExperience() + " лет.");
        }
        System.out.println("-----------------------------------------------------------\n");
    }
}
