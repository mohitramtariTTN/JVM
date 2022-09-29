import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FourthTopic {
    /*** Created the Class Employee here ***/
    static class Employee{
        private String name,designation;
        private int age;

        /*** Made the constructor for class employee here ***/
        Employee(String name, String designation,int age){
            this.name = name;
            this.designation = designation;
            this.age = age;
        }

        /*** Overriding the equals method, so that hashmap doesn't include two different objects which have the same values ***/
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return age == employee.age && name.equals(employee.name) && designation.equals(employee.designation);
        }

        /*** Overriding hashCode here ***/
        @Override
        public int hashCode() {
            return Objects.hash(name, designation, age);
        }
    }
    public static void main(String[] args){
        String name,designation;
        int age,salary;
        Map<Employee,Integer>employeeSalary = new HashMap<Employee,Integer>();

        /*** Making objects of Employee class here ***/
        Employee emp1 = new Employee("Mohit Ramtari","JVM",21);
        Employee emp2 = new Employee("Shushant Singh", "Data Gngineer", 24);
        Employee emp3 = new Employee("Vaibhav Kamal", "DevOps",22);
        Employee emp4 = new Employee("Mohit Ramtari","JVM",21);

        /*** Putting the necessary data in HashMap ***/
        employeeSalary.put(emp1,25000);
        employeeSalary.put(emp2,30000);
        employeeSalary.put(emp3,27000);
        employeeSalary.put(emp4,25000);

        /*** Printing employee name and employee salary  from the hashmap***/
        for(Employee key : employeeSalary.keySet()){
            System.out.println("Employee Name : " + key.name);
            System.out.println("Employee salary : " + employeeSalary.get(key)+"\n");
        }
    }
}
