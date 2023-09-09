import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaSortingExamples {
    public static void main(String[] args) {

        String[] fruitNames = new String[5];

        fruitNames[0] = "Apple";
        fruitNames[1] = "Mango";
        fruitNames[2] = "Guava";
        fruitNames[3] = "Orange";
        fruitNames[4] = "Grapes";
        System.out.println("Elements of array w/o sorting --");
        for (String name : fruitNames){
            System.out.println(name);
        }
        System.out.println("Elements of array after sorting --");
        Arrays.sort(fruitNames);
        for (String name : fruitNames){
            System.out.println(name);
        }

        List<String> guestList = new ArrayList<>();
        guestList.add("Vikram");
        guestList.add("Karan");
        guestList.add("Moin");
        guestList.add("Pratik");
        guestList.add("Komal");
        System.out.println("Elements of List w/o sorting --");
        guestList.forEach(System.out::println);
        Collections.sort(guestList);
        System.out.println("Elements of List after sorting --");
        guestList.forEach(System.out::println);

    }
}
