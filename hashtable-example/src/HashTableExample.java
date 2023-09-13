import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("Vikram",1);
        hashtable.put("Moin",2);
        hashtable.put("Komal",3);
//        hashtable.put(null, 4);

        System.out.println("Value against Moin is : " + hashtable.get("Moin"));

        hashtable.forEach((t,u) -> System.out.println(t + " "+u));

        hashtable.remove("Komal");

        System.out.println("After removing an element");
        hashtable.forEach((t,u) -> System.out.println(t + " "+u));


    }
}
