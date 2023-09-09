import java.util.*;

class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o instanceof Employee) {
            Employee employee = (Employee) o;
            return this.id == employee.id && this.name.equals(employee.name);
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class CompareById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id - o2.id;
    }
}

class CompareByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.equals(o2.name) ? 0 : 1;
    }
}
public class ComparatorExample {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Vikram",100));
        employeeList.add(new Employee("Karan",400));
        employeeList.add(new Employee("Moin",500));
        employeeList.add(new Employee("Pratik",200));
        employeeList.add(new Employee("Komal",300));

        System.out.println("before sorting");
        employeeList.forEach(System.out::println);
        CompareById compareById = new CompareById();
        Collections.sort(employeeList,compareById);
        System.out.println("after sorting");
        employeeList.forEach(System.out::println);
    }
}
