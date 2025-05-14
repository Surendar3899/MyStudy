package Java8.StreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap_TCS {

    public static void main(String[] args) {
         // Sample map of names and designations
        Map<String, String> map = new HashMap<>();
        map.put("Alice", "Manager");
        map.put("Bob", "Developer");
        map.put("Charlie", "Designer");
        map.put("David", "Developer");
        map.put("Eve", "Tester");

        // Sorting the map by designation (values)
        Map<String, String> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey()) // Sorting based on the designation (values)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,    // Collect the name (key)
                        Map.Entry::getValue,  // Collect the designation (value)
                        (oldValue, newValue) -> oldValue, // In case of conflict, keep the old value
                        LinkedHashMap::new)); // LinkedHashMap to maintain insertion order (sorted)

        // Display the sorted map
        sortedMap.forEach((name, designation) -> 
            System.out.println("Name: " + name + ", Designation: " + designation));
    }

}
