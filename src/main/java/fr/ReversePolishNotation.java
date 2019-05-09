package fr;

class ReversePolishNotation {
    static String calculate(String instructions) {

        String[] s = instructions.split(" ");
        String first = s[0];
        String second = s[1];

        Integer result = Integer.valueOf(first) + Integer.valueOf(second);
        return String.valueOf(result);
    }
}
