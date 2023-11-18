import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HRbook {
    private List<Employee> personList;
    public HRbook(List<Employee> personList) {
        this.personList = personList;
    }
    public List<Employee> findByExperience(int experience) {
        return personList.stream().filter(employee -> employee.getExperience() == experience).collect(Collectors.toList());
    }

    public List<String> findPhoneByName(String name) {
        List<String> numList = new ArrayList<>();
        for (Employee employee : personList) {
            if (employee.getName().equals(name)) numList.addAll(employee.getPhoneNum());
        }
        return numList;
    }
    public List<Employee> findByServiceNum(int serviceNum) {
        return personList.stream().filter(employee -> employee.getServiceNum() == serviceNum).collect(Collectors.toList());
    }

    public void addEmployee(Employee employee) {
        personList.add(employee);
    }

    public List<Employee> getPersonList() {
        return personList;
    }
}
