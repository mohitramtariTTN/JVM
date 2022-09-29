import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SecondTopicComparator {
    static class Employee {
        private double age,salary;
        private String name;

        /*** Made Constructor for Employee class ***/
        Employee(String name,double age, double salary){
            this.age = age;
            this.salary = salary;
            this.name = name;
        }
    }

    static class salaryComparator implements Comparator<Employee>{
        @Override
        public int compare(Employee employee, Employee t1) {
            if(employee.salary>t1.salary)
                return 1;
            else if (employee.salary<t1.salary) {
                return -1;
            }else{
                return 0;
            }
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

        Collections.sort(employees, new salaryComparator());
        for(Employee employee:employees){
            System.out.println("Employee Name : " + employee.name);
            System.out.println("Employee Age : " + employee.age);
            System.out.println("Employee Salary : " + employee.salary + "\n");
        }
    }
}
