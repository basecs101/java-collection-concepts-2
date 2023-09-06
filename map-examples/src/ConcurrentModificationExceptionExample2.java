import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationExceptionExample2 {

    public static void main(String[] args) {

        Map<String, Long> phoneBook = new ConcurrentHashMap<>();

        phoneBook.put("Vikram",8149101254L);
        phoneBook.put("Mike",9020341211L);
        phoneBook.put("Jim",7788111284L);
        System.out.println(phoneBook);

        Iterator<String> keyIterator = phoneBook.keySet().iterator();//3 elements

        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            System.out.println("key = "+ key);
            if ("Vikram".equals(key)){
                keyIterator.remove();//this works and removes ele from map
                phoneBook.remove("Jim");//remove element from map is not allowed

            }
        }
        System.out.println(phoneBook);
    }
}