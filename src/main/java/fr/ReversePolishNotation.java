package fr;

class ReversePolishNotation {

    private static final String regex = " ";

    static String calculate(String instructions) {

        String[] s = parseInstructions(instructions);
        String first = s[0];
        String second = s[1];

        Integer result = add(first, second);
        return print(result);
    }

    private static String print(Integer result) {
        return result.toString();
    }

    private static int add(String first, String second) {
        return Integer.valueOf(first) + Integer.valueOf(second);
    }

    private static String[] parseInstructions(String instructions) {
        return instructions.split(regex);
    }
}
