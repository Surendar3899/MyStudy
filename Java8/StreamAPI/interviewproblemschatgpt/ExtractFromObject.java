package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractFromObject {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("surendar");
        e1.setDesignation("developer");


        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("susi");
        e2.setDesignation("QA");


        Employee e3 = new Employee();
        e3.setId(3);
        e3.setName("dinesh");
        e3.setDesignation("QA");

        List<Employee> li = new ArrayList();
        li.add(e1);
        li.add(e2);
        li.add(e3);

        List<String> lis = li.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(lis);
        
        
    }

}

class Employee{
    int id;
    String name;
    String designation;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
