import java.util.LinkedHashSet;
import java.util.Set;

//Insertion order is maintained.
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> fruitNames = new LinkedHashSet<>();

        fruitNames.add("Mango");
        fruitNames.add("Apple");
        fruitNames.add("Guava");
        fruitNames.add("Orange");

        System.out.println("-----------------------");
        System.out.println("isEmpty set ? "+fruitNames.isEmpty());
        System.out.println("-----------------------");
        System.out.println("size : "+fruitNames.size());
        System.out.println("-----------------------");
        for (String fruitName : fruitNames){
            System.out.println("Name : "+ fruitName );
        }
        System.out.println("-----------------------");
        fruitNames.remove("Apple");

        for (String fruitName : fruitNames){
            System.out.println("Name : "+ fruitName );
        }
        System.out.println("-----------------------");
        System.out.println("size : "+fruitNames.size());
        System.out.println("-----------------------");
    }
}

