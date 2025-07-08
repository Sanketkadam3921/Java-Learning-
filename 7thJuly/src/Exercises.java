import java.util.ArrayList;

class Student {
    String name ;
    int age ;
    double marks ;

    Student(String name , int age , double marks){
        this.name = name ;
        this.age = age ;
        this.marks = marks ;
    }
    public String toString() {
        return name + " ( Age : " + age + " , Marks  " + marks + ")";
    }
}
public class Exercises {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Sanket",20,49.34));
        students.add(new Student("Divya" , 22 ,41.00));
        students.add(new Student("Isha" , 22 ,31.00));

        System.out.println("All students");
        for ( Student s : students){
            System.out.println(s);
        }
        double total = 0 ;
        for ( Student s : students){
            total+= s.marks;
        }
        double avg = total / students.size();
        System.out.println("\nAverage marks :" + avg );

        students.removeIf(s -> s.marks < 40);
        System.out.println("\nStudents with marks >= 40 are ");
        for ( Student s : students){
            System.out.println(s);
        }

    }
}
