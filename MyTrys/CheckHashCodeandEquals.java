package MyTrys;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class CheckHashCodeandEquals {

    public static void main(String[] args) {
        PersonKey p1 = new PersonKey("surendar",25);
        PersonKey p6 = new PersonKey("surendar",25);
        PersonKey p5 = new PersonKey("aadhan",25);
        PersonKey p2 = new PersonKey("susi",25);
        PersonKey p3 = new PersonKey("aravind",25);
        PersonKey p4 = new PersonKey("dinesh",25);
        Set<PersonKey> se = new HashSet<>();
        se.add(p1);
        System.out.println(p1.hashCode());
        se.add(p6);
        System.out.println(p6.hashCode());
        se.add(p5);
        System.out.println(p5.hashCode());
        se.add(p2);
        System.out.println(p2.hashCode());
        se.add(p3);
        System.out.println(p3.hashCode());
        se.add(p4);
        System.out.println(p4.hashCode());
        
        System.out.println(se.toString());

    }

}
class PersonKey implements Comparable<PersonKey>{
    String name;
    int age;
    public PersonKey(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(PersonKey other) {
        // You can compare by name, then age
        System.out.println("compareTo called");
        System.out.println("this "+this.name);
        System.out.println("other "+other.name);
        int nameCompare = this.name.compareTo(other.name);
        return nameCompare != 0 ? nameCompare : Integer.compare(this.age, other.age);
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
    public int hashCode(){
        System.out.println("hashcode called");
        return Objects.hash(name,age);
    }

    @Override
    public String toString(){
        return this.name+" "+this.age;
    }
}


