package OOPS.tryInterface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        String filePath = "/home/surendarn/Documents/11-06-2025/input.txt";
        try {
        	
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream))) {
                String line;
                int k = 0;
                List<Integer> list = new ArrayList<>();
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    if (line.trim().isEmpty() ) {
	            	    continue;
	                }
                    String[] parts = line.split(",");
                    String number = parts[0].trim(); 
                    int number1 = Integer.parseInt(number);
                    list.add(number1);

                    
                }

                Collections.sort(list, Collections.reverseOrder());
                System.out.println(list);
                File file = new File("/home/surendarn/Documents/11-06-2025/output.txt");

                try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
                    for (int i = 0; i < list.size(); i++) {
                        String line1 = list.get(i) + System.lineSeparator(); // adds newline
                        fileOutputStream.write(line1.getBytes());
                    }
                    System.out.println("File written successfully!");
                } catch (IOException e) {
                    e.printStackTrace();
                }



            }catch(Exception e){
                System.out.println(e);
            }
        } catch (FileNotFoundException e) {
            System.err.println("CSV file not found: " + filePath);
            e.printStackTrace();
        }
    }
}
