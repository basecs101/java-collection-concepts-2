import java.util.*;
import java.util.function.Function;

class Employee {
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

class CompareById implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.id - e2.id;
    }
}

class CompareByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        Comparator<String> stringComparator = Comparator.naturalOrder();

        return stringComparator.compare(o1.name, o2.name);
    }
}
public class ComparatorExample {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Vikram",100, 130000));
        employeeList.add(new Employee("Karan",100, 120000));
        employeeList.add(new Employee("Karan",100, 110000));
        employeeList.add(new Employee("Moin",500, 300000));
        employeeList.add(new Employee("Pratik",200, 120000));
        employeeList.add(new Employee("Komal",100, 100000));

        System.out.println("before sorting");
        employeeList.forEach(System.out::println);
        CompareById compareById = new CompareById();
        Collections.sort(employeeList,compareById);
        System.out.println("after sorting on ids");
        employeeList.forEach(System.out::println);
        CompareByName compareByName = new CompareByName();
        Collections.sort(employeeList, compareByName);
        System.out.println("after sorting on names");
        employeeList.forEach(System.out::println);

        //comparator example using streams
        System.out.println("Compare(id) and thenComparing(name) ");
        //Compare on the basis of id
//        Comparator<Employee> idComparator = Comparator.comparingInt(Employee::getId);
//        // Use thenComparing to add secondary sorting by name
//        Comparator<Employee> nameComparator = idComparator.thenComparing(Employee::getSalary);
//        // Use thenComparing to add third sorting by name
//        Comparator<Employee> salaryComparator = nameComparator.thenComparing(Employee::getSalary);

        // Sort the list of employee using the combined comparator

        Function<Employee, Integer> lambdaFunction = employee -> employee.id;

        List<Employee> sortedEmployee = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getId)
                        .thenComparing(Employee::getName)
                        .thenComparing(Employee::getSalary))
                .toList();

        sortedEmployee.forEach(System.out::println);

    }
}
