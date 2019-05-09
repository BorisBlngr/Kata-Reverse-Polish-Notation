package fr;

class ReversePolishNotation {

    private static final String regex = " ";

    static String calculate(String instructions) {
        Instruction instruction = parseInstructions(instructions);

        Integer result = instruction.compute();
        return print(result);
    }

    private static String print(Integer result) {
        return result.toString();
    }

    private static Instruction parseInstructions(String instructions) {

        String[] s = instructions.split(regex);

        return new Instruction(Integer.valueOf(s[0]), Integer.valueOf(s[1]), s[2]);
    }


}
