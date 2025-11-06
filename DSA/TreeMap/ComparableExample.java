package DSA.TreeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Define the natural ordering
    @Override
    public int compareTo(Student other) {
        // sort by rollNo ascending
        System.out.println(this.rollNo);
        System.out.println(other.rollNo);
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return name + "(" + rollNo + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Charlie", 103));
        list.add(new Student("Alice", 101));
        list.add(new Student("Bob", 102));

        // sort using natural ordering (compareTo)
        Collections.sort(list);

        System.out.println("Sorted using Comparable:");
        list.forEach(System.out::println);
    }
}
