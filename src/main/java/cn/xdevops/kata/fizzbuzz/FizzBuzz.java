package cn.xdevops.kata.fizzbuzz;

public class FizzBuzz {
    private FizzBuzz() {
        throw new IllegalStateException("Utility class");
    }

    public static String of(int i) {
        if (i == 0) {
            return "0";
        }

        return ofInt(i);
    }

    private static String ofInt(int i) {
        String s = "";
        if (i % 3 == 0) {
            s += "Fizz";
        }
        if (i % 5 == 0) {
            s += "Buzz";
        }
        return !s.isEmpty() ? s : String.valueOf(i);
    }
}
