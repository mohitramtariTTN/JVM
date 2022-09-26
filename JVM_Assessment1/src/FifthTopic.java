class Employee{
    //Declaring Variables here
    private String firstName,lastName,designation;
    private int age;

    //Default Constructor
    public Employee(){
        this("first_name","last_name","designation",20);
    }

    //Parameterized Constructor
    public Employee(String firstName, String lastName, String designation, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.age = age;
    }

    //Setter Methods
    public void setFirstName(String  firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }

    //Getter Methods
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public String getDesignation(){
        return this.designation;
    }

    //Overriding toString method
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.firstName).append(" ").append(this.lastName);
        return sb.toString();
    }
}

public class FifthTopic{
    public static void main(String[] args){
        //Creating the objects of Employee class
        Employee emp1  = new Employee();
        Employee emp2 = new Employee("Mohit","Ramtari","Software Engineer",21);

        //Setting the variables for emp1 object
        emp1.setFirstName("Shushant");
        emp1.setLastName("Singh");
        emp1.setAge(23);
        emp1.setDesignation("Software Engineer");

        //Printing the data of emp1
        System.out.println(emp1.getFirstName());
        System.out.println(emp1.getLastName());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getDesignation());

        //Printing the data of emp2
        System.out.println(emp2.getFirstName());
        System.out.println(emp2.getLastName());
        System.out.println(emp2.getAge());
        System.out.println(emp2.getDesignation());

        System.out.println("Overriding the toString Method : " + emp1);
    }
}
