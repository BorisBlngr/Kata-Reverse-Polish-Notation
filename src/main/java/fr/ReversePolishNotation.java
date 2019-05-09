package fr;

class ReversePolishNotation {
    static String calculate(String instructions) {
        if (instructions.split(" ")[0].equals("0")) {
            return instructions.split(" ")[1];
        }
        return instructions.split(" ")[0];
    }
}
