import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourthTopic {
    static class Employee{
        private String fullName;
        private long salary;
        private String city;

        /*** Made Constructor here ***/
        Employee(String fullName,long salary, String city){
            this.fullName = fullName;
            this.salary = salary;
            this.city = city;
        }
    }
    public static void main(String[] args) {

        List<Integer> list =  Arrays.asList(3,50,24,53,5,6,10,32,96); //Created a list of integers
        list.stream().filter(e->e%2==0).forEach(System.out::println); //Filter the even numbers from list

        /*** Made a new list of Employess ***/
        ArrayList<Employee>employees = new ArrayList<Employee>();

        /*** Adding employees to the list ***/
        employees.add(new Employee("Mohit Ramtari",2000,"Gwalior"));
        employees.add(new Employee("Suyash Deep Rajput",5000,"Delhi"));
        employees.add(new Employee("Chandan Kumar Singh",2500,"Noida"));
        employees.add(new Employee("Ankit Kumar Singh",4000,"Delhi"));
        employees.add(new Employee("Shubham Kumar Gupta",6000,"Delhi"));
        employees.add(new Employee("Kuldeep Singh Bisht",8000,"Haryana"));
        employees.add(new Employee("Pradeep Singh Bisht",1000,"Delhi"));
        employees.add(new Employee("Nitish Kumar Arya",2789,"Delhi"));
        employees.add(new Employee("Nitish Kumar Sharma",3500,"Delhi"));

        /*** filter() method will select employees which have salary less than 5000 and live in Delhi ***/
        /*** map() method will split the full name of employee to just first name ***/
        /*** distinct() will only provide unique values ***/
        employees.stream().filter(e ->e.salary<5000 && e.city=="Delhi").map(e->e.fullName.split("\\ ")[0]).distinct().forEach(e-> System.out.println(e));
    }
}
