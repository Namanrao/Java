package datatypes;

import com.sun.security.jgss.GSSUtil;

public class Test {

    public static void main(String [] args){
        String name1 = "Akshit Sharma";
        int length= name1.length();


//    How to check the equality of the string .
        String name2 = "akshit Sharma";

//        System.out.println(name1.equals(name2));

//        but you also have to ignore the upper case letter in that case;

//        System.out.println(name1.equalsIgnoreCase(name2));
/*
        String str1 = "remote";
        String str2 = "car";

        int i = str1.compareTo(str2);
        System.out.println(i);
            */

        /* String name =  "Naman Rao";

        String string = name.substring(0,4); //last range is not included.
        System.out.println(string);
        */


        /*String name = "Naman Rao"; //Remove the extra space in the string.
        //Original string remains unchanged because it is immutable.
        System.out.println(name.trim());
        String newName = name.replace("Naman", "Ravi");
        System.out.println(newName);
            */

        /*
        int a = 10;
        String s = String.valueOf(a);
        System.out.println(s);
        */

        String formattedStr = String.format("My name is %s and I am %d years old.", "John",25);
        System.out.println(formattedStr);

        String name = "Amar Panchal";
        System.out.println(name.substring(2,8));
        System.out.println(name.subSequence(2,8));


    }
}
