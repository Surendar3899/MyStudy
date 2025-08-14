public class Student implements Comparable<Student>{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        System.out.println("this  "+this.name +"  other "+other.name);
        
        int r = this.rollNo - other.rollNo;
        System.out.println("compareTo "+r);
        return r;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }

}
