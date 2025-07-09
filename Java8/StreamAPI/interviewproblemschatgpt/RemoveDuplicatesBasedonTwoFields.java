package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}

public class RemoveDuplicatesBasedonTwoFields {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person(1, "Alice", 25),
            new Person(2, "Bob", 30),
            new Person(3, "Alice", 25), // Duplicate name and age
            new Person(4, "Charlie", 35),
            new Person(5, "Bob", 30)    // Duplicate name and age
        );

        // Remove duplicates based on name and age, keeping the last occurrence
        List<Person> uniqueByNameAndAge = people.stream()
            .collect(Collectors.toMap(
                person -> new PersonKey(person.getName(), person.getAge()), // Composite key
                person -> person, // Value: Person object
                (existing, replacement) -> replacement // Keep last occurrence
            ))
            .values()
            .stream()
            .collect(Collectors.toList());

        System.out.println("Unique by Name and Age: " + uniqueByNameAndAge);
    }

       // Helper class for composite key
    static class PersonKey {
        private final String name;
        private final int age;

        PersonKey(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            System.out.println("equals called");
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PersonKey personKey = (PersonKey) o;
            return age == personKey.age && Objects.equals(name, personKey.name);
        }

        @Override
        public int hashCode() {
            System.out.println("hashcode called");
            return Objects.hash(name, age);
        }
    }

}


