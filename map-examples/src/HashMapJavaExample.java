import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapJavaExample {

    public static void main(String[] args) {
        Map<String, Long> myPhoneBook = new HashMap<>();

        /*
        0[3000h] --> [2000000 | "Komal" | 1212121212L | 4000h ] ---> [3000000 | "Bhagyashree" | 3456345634L | null ]
        1[]
        2[]
        3[]
        4[1000h] --> [1000000 | "Vikram" | 1234123412L | 3456h ] --> [5000000 | "Moin" | 4545454545L | null ]
        5[]
        6[]
        7[]
         */

        myPhoneBook.put("Vikram", 1234123412L);//insert and update

        myPhoneBook.put("Komal",2345234523L);
        myPhoneBook.put("Komal",1212121212L);


        myPhoneBook.put("Bhagyashree",3456345634L);
        myPhoneBook.put(null, null);
        myPhoneBook.put("abc", null);
        myPhoneBook.put("Moin", 3232324545L);
        myPhoneBook.put("Moin", 4545454545L);

        myPhoneBook.remove(null);

        System.out.println(myPhoneBook);
        System.out.println("--------keys---------");
        for (String key : myPhoneBook.keySet()){
            System.out.println("key = "+ key);
        }
        System.out.println("--------values--------");

        for (Long value : myPhoneBook.values()){
            System.out.println("v = "+ value);
        }
        System.out.println("-------Entries----------");

        for (Map.Entry<String, Long> entry : myPhoneBook.entrySet()){
            System.out.println("K = " + entry.getKey() + " V = " + entry.getValue());
        }
        System.out.println("---------------------");

        Iterator<String> iterator = myPhoneBook.keySet().iterator();
        //iterator is a pointer that will iterate over set elements.

        System.out.println("---------Iterator----------");

        while (iterator.hasNext()){
            System.out.println("key = "+iterator.next());
        }
    }
}
