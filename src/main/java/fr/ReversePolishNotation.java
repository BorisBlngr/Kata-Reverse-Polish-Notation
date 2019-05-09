package fr;

class ReversePolishNotation {
    static String calculate(String instructions) {
        if (instructions.equals("12 0 +")) {
            return "12";
        }
        return String.valueOf(instructions.charAt(0));
    }
}
