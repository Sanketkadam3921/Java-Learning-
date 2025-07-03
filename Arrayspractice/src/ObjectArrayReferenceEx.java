import java.util.Arrays;

public class ObjectArrayReferenceEx {
    public static void updateName (String[] names){
        names[1] = "Sanket";
    }

    public static void main(String[] args) {
        String[] students = {"Amit" , "Sneha" ,"Rahul"};
        updateName(students);
        System.out.println("Updated array" + Arrays.toString(students));
    }
}
