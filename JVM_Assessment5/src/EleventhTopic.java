/***
 * Question : use record to create an immutable represent of student(name, id, age)
 * and use its  constructor for initialization, equals to compare 2 students methods.
 * Also keep a static counter to keep the count of objects created.
 */

import java.util.Objects;

/*** Created a record here ***/
record student(String name, int id, int age) {

    /*** Created variable and method to keep track of number of objects created ***/
    static int count = 0;
    static void incrementCounter(){
        count += 1;
    }
    student{
        incrementCounter();
    }

    /*** Override the equals and hashCode methods, here equals method compares
     * objects on the basis of their ids
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
public class EleventhTopic {
    public static void main(String[] args) {
        /*** Created some objects here ***/
        student obj1 = new student("Mohit Ramtari", 6603,20);
        student obj2 = new student("Vaibhav Kamal", 6585,22);
        student obj3 = new student("Mohit Ramtari", 6603,20);

        /*** Checking the equals method here ***/
        if(obj1.equals(obj3)){
            System.out.println(obj1.name());
            System.out.println(obj3.name());
            System.out.println("Both employees are same"+"\n");
        }

        if(!obj1.equals(obj2)){
            System.out.println(obj2.name());
            System.out.println(obj3.name());
            System.out.println("Both employees are not same"+"\n");
        }
        /*** Printing the count of objects here ***/
        System.out.println("Number of objects created : " + obj1.count);
    }
}

/***
 * Output :
 * Mohit Ramtari
 * Mohit Ramtari
 * Both employees are same
 *
 * Vaibhav Kamal
 * Mohit Ramtari
 * Both employees are not same
 *
 * Number of objects created : 3
 */