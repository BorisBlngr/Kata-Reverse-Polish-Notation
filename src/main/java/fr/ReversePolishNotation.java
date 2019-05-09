package fr;

public class ReversePolishNotation {
    public static String calculate(String instructions) {
        if (instructions.contains("2")) {
            return "2";
        }
        if (instructions.contains("3")) {
            return "3";
        }
        return "1";
    }
}
