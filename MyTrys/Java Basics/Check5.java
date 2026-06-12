import java.util.HashSet;
import java.util.Set;

public class Check5 {
    public static void main(String[] args) {
        Set<Test> set = new HashSet<>();
        Test t1 = new Test();
        t1.setName("surendar");
        t1.setAge(25);

        Test t2 = new Test();
        t2.setName("surendar");
        t2.setAge(25);


        set.add(t1);
        set.add(t2);


        System.out.println(set.size());

    }

}

class Test{
    String name;
    int age;
    public int getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int value) {
        this.age = value;
    }
}
