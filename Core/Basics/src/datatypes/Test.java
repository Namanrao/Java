package datatypes;

public class Test {

    public static void main(String [] args){
        int a =1;
        Student student = new Student(); //stored in heap memory.
        student.address  = "Gwalior";
        student.name = "Naman";
        student.standard = 4;
        student.rollNumber = 123432;


        System.out.println(student.name);
    }
}
