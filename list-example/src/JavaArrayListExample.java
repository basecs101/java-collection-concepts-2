import java.util.ArrayList;
import java.util.List;
/*
Iterable
^
|
Collection
^
|
List
^
|
ArrayList

 */
public class JavaArrayListExample {
    public static void main(String[] args) {


        List<String> guestList = new ArrayList<>(2);

        //base address + index*size of address stored.
        guestList.add("Karan");
        guestList.add("Aarti");
        guestList.add("Komal");
        guestList.add("Vikram");

        guestList.forEach(System.out::println);
        System.out.println("------------------");
        guestList.add(0, "Bhagyashree");

        guestList.forEach(System.out::println);
        System.out.println("------------------");
        guestList.add(2,"Pratik");

        guestList.forEach(System.out::println);
        System.out.println("------------------");
        guestList.remove(0);

        guestList.forEach(System.out::println);
        System.out.println("------------------");

        guestList.remove(2);

        guestList.forEach(System.out::println);
        System.out.println("------------------");





    }
}
