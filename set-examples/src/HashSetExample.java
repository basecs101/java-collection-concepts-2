import java.util.HashSet;
import java.util.Set;

//Insertion order is not maintained.
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> fruitNames = new HashSet<>();

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
        fruitNames.forEach(item -> System.out.println("item"));
        System.out.println("-----------------------");
        System.out.println("size : "+fruitNames.size());
        System.out.println("-----------------------");
    }
}
