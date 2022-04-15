import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}

class Test3{
    public static void main(String[] args) {
        Employee e1 = new Employee("solo",38);
        Employee e2 = new Employee("john",20);
        Employee e3 = new Employee("henry",33);
        Employee e4 = new Employee("tom", 40);
        List<Employee> hrDep = Arrays.asList(e1,e2,e3);
        List<Employee> itDep = Arrays.asList(e1,e4);


        //a
        List<Employee> combined = Stream.concat(hrDep.stream(), itDep.stream())
                .distinct()
                .collect(Collectors.toList());

        //b
        Collections.sort(combined, Comparator.comparing(Employee::getName));
        Collections.reverse(combined);

        System.out.println(combined);

        //c
        Collections.sort(combined, Comparator.comparing(Employee::getAge));
        Collections.reverse(combined);

        System.out.println(combined);

        new Thread(() -> {},"");




    }
}
