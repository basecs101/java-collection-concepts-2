import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapJavaExample {

    public static void main(String[] args) {
        Map<String, Long> myPhoneBook = new LinkedHashMap<>();

        myPhoneBook.put("Vikram", 1234123412L);

        myPhoneBook.put("Komal",2345234523L);
        myPhoneBook.put("Komal",1212121212L);


        myPhoneBook.put("Bhagyashree",3456345634L);
        myPhoneBook.put(null, null);
        myPhoneBook.put("abc", null);

        myPhoneBook.remove(null);

        System.out.println(myPhoneBook);

        for (String key : myPhoneBook.keySet()){
            System.out.println("key = "+ key);
        }

        for (Map.Entry<String, Long> entry : myPhoneBook.entrySet()){
            System.out.println("K = " + entry.getKey() + " V = " + entry.getValue());
        }
    }
}
