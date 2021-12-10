/**
 * Create a class employee which includes variabls organization, name & location along with a method bonus();
 * consider the subclass manager which includes name and id override the bonus as 20% of the basic salary
 * consider another subclass called clerk which has variable name id override the bonus as 10% of the basic salary
 * include `super()` in each subclass
 */


class Employee {
    String organization;
    String name;
    String location;

    Employee(String organization, String name, String location) {
        this.organization = organization;
        this.name = name;
        this.location = location;
    }
    double bonus(int BasicSalary){
        return BasicSalary*0.1;
    }
}
class Manager extends Employee {
    String name;
    int id;
    Manager(String name, int id) {
        super("Google", "Manish", "USA");
        this.name = name;
        this.id = id;
    }
    double bonus(int basicSalary) {
        return basicSalary*0.20;
    }
}
class Clerk extends Employee {
    String name;
    int id;
    Clerk(String name, int id) {
        super("Apple", "John", "USA");
        this.name = name;
        this.id = id;
    }
    double bonus(int basicSalary) {
        return basicSalary*0.10;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("ABC", "John", "Bangalore");
        
        System.out.println("Employee 1: "+e1.name+" "+e1.organization+" "+e1.location+" "+e1.bonus(10000));

        Employee e2 = new Manager("ABC", 123);
        System.out.println("Employee 2: "+e2.name+" "+e2.organization+" "+e2.location+" "+e2.bonus(10000));

        Employee e3 = new Clerk("XYZ", 456);
        System.out.println("Employee 3: "+e3.name+" "+e3.organization+" "+e3.location+" "+e3.bonus(10000));
    }
}
