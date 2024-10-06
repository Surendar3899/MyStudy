package Java8.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {
        List<Student> StudentList = new ArrayList<Student>();
        StudentList.add(new Student("Surendar", 98.5));
        StudentList.add(new Student("Ajith", 100));
        StudentList.add(new Student("Prem", 80));
        StudentList.add(new Student("Dinesh", 70));
        StudentList.add(new Student("Kannan", 30));
        StudentList.add(new Student("Ezhilan", 25));

        Predicate<Student> lessthan40 = list->list.getMarks() < 40;
        Predicate<Student> fortyto90 = list->list.getMarks() > 40 && list.getMarks() < 90;


        for(Student std:StudentList){
          if(lessthan40.test(std)){
            System.out.println("names below 40");
            System.out.println(std.getName());
          }else if(fortyto90.test(std)){
            System.out.println("names below 90 and above 40");
            System.out.println(std.getName());
          }
        }

        
    }
}
