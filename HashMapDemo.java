import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

       
        Map<String, Integer> map = new HashMap<>();

    
        map.put("Virat", 120);
        map.put("Rohit", 98);
        map.put("Dhoni", 85);
        map.put("Rahul", 76);

      
        System.out.println("Cricketer Scores:");
        System.out.println(map);

        String batsman = "Virat";

        if (map.containsKey(batsman)) {
            System.out.println(batsman + "'s score is: " + map.get(batsman));
        } else {
            System.out.println("Batsman not found");
        }
    }
}
