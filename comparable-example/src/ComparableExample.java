import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Student implements Comparable<Student>{
    String name;
    int id;

    public Student(String name, int id) {
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

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;// greater than 1 or less than 1 or zero
    }
}
public class ComparableExample {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Vikram",100));
        studentList.add(new Student("Karan",400));
        studentList.add(new Student("Moin",500));
        studentList.add(new Student("Pratik",200));
        studentList.add(new Student("Komal",300));

        System.out.println("before sorting");
        studentList.forEach(System.out::println);
        Collections.sort(studentList);
        System.out.println("after sorting");
        studentList.forEach(System.out::println);
    }
}
