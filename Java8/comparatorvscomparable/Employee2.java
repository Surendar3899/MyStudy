package Java8.comparatorvscomparable;

public class Employee2 implements Comparable<Employee2> {
   private String name;
    private String department;
    private int salary;

    public Employee2(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }

    @Override
    public int compareTo(Employee2 o) {
        System.out.println("compare to calling");
        //int result = Integer.compare(this.salary,o.salary);
        int result = this.name.compareTo(o.name);
        System.out.println("result is "+result +" "+this.salary+" "+o.salary);
        return result;
    }
}
