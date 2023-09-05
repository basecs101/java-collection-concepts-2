import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

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
LinkedList

 */
public class JavaLinkedListExample {
    public static void main(String[] args) {


        List<String> guestList = new LinkedList<>();

        guestList.add("Karan");
        guestList.add("Aarti");
        guestList.add("Komal");
        guestList.add("Vikram");

        for(String name : guestList){
            System.out.println(name);
        }

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
