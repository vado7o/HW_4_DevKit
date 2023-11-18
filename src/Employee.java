import java.util.List;

public class Employee {
    private int serviceNum;
    private List<String> phoneNums;
    private String name;
    private int experience;

    public int getServiceNum() {
        return serviceNum;
    }

    public List<String> getPhoneNum() {
        return phoneNums;
    }

    public String getName() {
        return name;
    }

    public Employee(int serviceNum, List<String> phoneNums, String name, int experience) {
        this.serviceNum = serviceNum;
        this.phoneNums = phoneNums;
        this.name = name;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
