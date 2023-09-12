import java.util.*;

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
public class ImmutableCollectionExamples {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Vikram",100, 130000));
        employeeList.add(new Employee("Karan",100, 120000));
        employeeList.add(new Employee("Karan",100, 110000));
        employeeList.add(new Employee("Moin",500, 300000));
        employeeList.add(new Employee("Pratik",200, 120000));
        employeeList.add(new Employee("Komal",100, 100000));

        Employee vikramEmp = new Employee("Vikram",100, 130000);

        //List.of method returns immutable list
        //cannot be added or removed items from the list
        List<Employee> immutableList = List.of(
                vikramEmp,
                new Employee("Karan",100, 120000),
                new Employee("Karan",100, 110000),
                new Employee("Moin",500, 300000)
        );

        System.out.println(immutableList);
        vikramEmp.id=200;//this is allowed because of Employee class is not immutable.
        System.out.println(immutableList);
//        immutableList.set(1, new Employee("Pratik",302,230000)); replace is not allowed
//        immutableList.remove(0);//adding or removing is not allowed on immutable list
//        immutableList.add(new Employee("Pratik",200, 120000));//adding or removing is not allowed on immutable list


        //Example of Arrays.asList()

        Employee[] employees = new Employee[]{vikramEmp,
                new Employee("Karan",100, 120000),
                new Employee("Pratik",100, 110000),
                new Employee("Moin",500, 300000)};
        List<Employee> employeeList1 = Arrays.asList(employees);//this returns list backed by each other
        //array changes are visible in the list
        //also list changes are visible in the array
        for (int i = 0; i < employees.length; i++) {
            System.out.print(" "+ employees[i].name);
        }
        System.out.println();
        System.out.println("employeeList1 list : "+ employeeList1);
        employees[0].name = "Vivek";

        for (int i = 0; i < employees.length; i++) {
            System.out.print(" "+ employees[i].name);
        }
        System.out.println();
        System.out.println("employeeList1 list : "+ employeeList1);
//        employeeList1.add(1, "Moin"); this is not allowed because array size is static and cannot updated.
//        employeeList1.remove(1);//not allowed
        employeeList1.set(0,new Employee("Bhaygashree",1,100000));
        for (int i = 0; i < employees.length; i++) {
            System.out.print(" "+ employees[i].name);
        }
        System.out.println();
        System.out.println("String list : "+ employeeList1);
    }
}
