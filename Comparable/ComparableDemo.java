import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        // List<Student> students = new ArrayList<>();
        // students.add(new Student(4, "Elango"));
        // students.add(new Student(3, "Ram"));
        // students.add(new Student(1, "Sita"));
        // students.add(new Student(2, "Lakshman"));
        // students.add(new Student(7, "Bala"));
        // students.add(new Student(5, "David"));

        // Collections.sort(students); // Automatically uses compareTo()

        TreeSet<Student> se = new TreeSet<>();
        se.add(new Student(4, "Elango"));
        se.add(new Student(3, "Ram"));
        se.add(new Student(1, "Sita"));
        se.add(new Student(2, "Lakshman"));
        se.add(new Student(7, "Bala"));
        se.add(new Student(5, "David"));

        for (Student s : se) {
            System.out.println(s);
        }
    }

}
