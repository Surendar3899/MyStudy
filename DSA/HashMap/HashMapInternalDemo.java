package DSA.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student{
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

     // Step 1: Override hashCode()
    @Override
    public int hashCode() {
        System.out.println("Computing hash for " + name);
        return Objects.hash(name);  // or simply return rollNo;
    }

    // Step 2: Override equals()
    @Override
    public boolean equals(Object obj) {
        System.out.println("Comparing " + this.name + " with " + ((Student)obj).name);
        if (this == obj) {
            return true;
        }    
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Student s = (Student) obj;
        return this.rollNo == s.rollNo;
    }

    @Override
    public String toString() {
        return name + "(" + rollNo + ")";
    }
}

public class HashMapInternalDemo {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();

        Student s1 = new Student("Alice", 103);
        Student s2 = new Student("Bob", 102);
        Student s3 = new Student("Alice", 103);  // Same rollNo → same hash

        System.out.println("\n--- Inserting s1 ---");
        map.put(s1, "Java");

        System.out.println("\n--- Inserting s2 ---");
        map.put(s2, "Python");

        System.out.println("\n--- Inserting s3 ---");
        map.put(s3, "C++");  // should replace s1’s value because same rollNo

        System.out.println("\n--- Printing map ---");
        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

}
