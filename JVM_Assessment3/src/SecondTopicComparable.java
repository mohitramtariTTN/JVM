import java.util.ArrayList;
import java.util.Collections;

public class SecondTopicComparable {
    /*** Here Employee class is implementing Comparable interface to change its natural ordering ***/
    static class Employee implements Comparable{
        private double age,salary;
        private String name;

        /*** Made Constructor for Employee class ***/
        Employee(String name,double age, double salary){
            this.age = age;
            this.salary = salary;
            this.name = name;
        }

        /*** Overriding compareTo method here ***/
        @Override
        public int compareTo(Object o) {
            Employee emp = (Employee)o;
            return this.name.compareTo(emp.name);
        }
    }

    public static void main(String[] args){

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Mohit Ramtari",21,25000));
        employees.add(new Employee("Mohan Bhargav",21,25000));
        employees.add(new Employee("Vaibhav Kamal",22,28000));
        employees.add(new Employee("Shushant Singh",24,30000));
        employees.add(new Employee("Shushant Rajput",24,30000));
        employees.add(new Employee("Ashish Rajput",25,30000));

        Collections.sort(employees);
        for(Employee employee:employees){
            System.out.println("Employee Name : " + employee.name);
            System.out.println("Employee Age : " + employee.age);
            System.out.println("Employee Salary : " + employee.salary + "\n");
        }
    }
}
