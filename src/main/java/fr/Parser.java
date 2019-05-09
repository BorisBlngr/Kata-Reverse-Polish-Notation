package fr;

class Parser {
    private String regex = " ";

    Parser(String regex) {
        this.regex = regex;
    }

    Instruction parseInstructions(String instructions) {
        String[] s = instructions.split(regex);
        return new Instruction(Integer.valueOf(s[0]), Integer.valueOf(s[1]), s[2]);
    }
}