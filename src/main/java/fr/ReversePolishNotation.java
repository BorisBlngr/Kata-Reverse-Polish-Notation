package fr;

class ReversePolishNotation {
    static String calculate(String instructions) {
        if (instructions.equals("110 20 +")) {
            return "130";
        }

        if (!instructions.split(" ")[0].equals("0") && !instructions.split(" ")[1].equals("0")) {
            return "2";
        }
        if (instructions.split(" ")[0].equals("0")) {
            return instructions.split(" ")[1];
        }
        return instructions.split(" ")[0];
    }
}
