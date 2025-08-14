package ObjectOrientedProgramming.Test;

public class UnknownNumberofParameters {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
    }

    public static int sum(int... a) { //Unspecified // unknown number of parameters can be passed through this method.
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
