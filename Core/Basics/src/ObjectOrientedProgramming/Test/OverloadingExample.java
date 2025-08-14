package ObjectOrientedProgramming.Test;

public class OverloadingExample {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(multiplyBy10(x));
    }

    public static int SumofArray(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        return res;
    }

    private static int sum(int a, int b) {
        return a + b;
    }


    // Below is an example of method overloading .
    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Below is an example of method overloading .

    private static float sum(float a, float b) {
        return a + b;
    }

    public static int multiplyBy10(int a) {
        return a * 10;
    }
}

