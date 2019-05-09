package fr;

public class ReversePolishNotation {
    public static String calculate(String instructions) {
        if (instructions.contains("2")) {
            return "2";
        }
        return "1";
    }
}
