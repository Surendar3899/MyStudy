package Java8.StreamAPI.interviewproblemschatgpt;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FindSenior {
    public static void main(String[] args) {
        Map<String,String> ma= new HashMap<>();
        ma.put("surendar","2023-06-15");
        ma.put("susi","2023-06-14");

        // Find the most senior employee (earliest date)
        Optional<Map.Entry<String, String>> senior = ma.entrySet()
            .stream()
            .min(Comparator.comparing(entry -> LocalDate.parse(entry.getValue())));

        // Output
        senior.ifPresent(entry -> System.out.println("Senior is: " + entry.getKey() + ", Joined on: " + entry.getValue()));

        
    }

}
