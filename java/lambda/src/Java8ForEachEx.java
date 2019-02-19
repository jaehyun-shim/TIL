import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8ForEachEx {
    public static void main(String[] args) {
        // forEach and Map
        Map<String, Integer> items = new HashMap<>();

        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);

        // Normal way
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }

        // In Java 8 forEach + lambda expression.
        items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        items.forEach((k, v) -> {
            System.out.println("Item : " + k + " Count : " + v);
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });

        // forEach and List
        List<String> items_ = new ArrayList<>();
        items_.add("A");
        items_.add("B");
        items_.add("C");
        items_.add("D");
        items_.add("E");

        // Normal way
        for(String item : items_){
            System.out.println(item);
        }

        // In Java 8 forEach + lambda expression.
        // Output : A,B,C,D,E
        items_.forEach(item->System.out.println(item));

        //Output : C
        items_.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });

        // method reference
        // Output : A,B,C,D,E
        items_.forEach(System.out::println);

        // Stream and filter
        // Output : B
        items_.stream()
                .filter(s->s.contains("B"))
                .forEach(System.out::println);
    }
}
