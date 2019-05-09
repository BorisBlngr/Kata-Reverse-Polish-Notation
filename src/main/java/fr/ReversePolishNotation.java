package fr;

class ReversePolishNotation {

    private static final String regex = " ";

    static String calculate(String instructions) {

        String[] s = parseInstructions(instructions);
        String first = s[0];
        String second = s[1];

        Integer result = Integer.valueOf(first) + Integer.valueOf(second);
        return String.valueOf(result);
    }

    private static String[] parseInstructions(String instructions) {
        return instructions.split(regex);
    }
}
