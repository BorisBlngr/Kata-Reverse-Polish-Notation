package fr;

class ReversePolishNotation {

    static String calculate(String instructions) {
        Instruction instruction = parseInstructions(instructions);

        Integer result = instruction.compute();
        return Printer.print(result);
    }

    private static Instruction parseInstructions(String instructions) {
        return new Parser(" ").parseInstructions(instructions);
    }


}
