package datatypes;

public class TestString {
    public static void main(String[] args) {
        String x = "Ram";
        String a = new String(x);
        String b = new String(x);
        String c = "Ram";
        String d= "Ram";

        System.out.println(a ==b); //here we are checking the reference from just ==.
        System.out.println(c ==d);
    }
}
