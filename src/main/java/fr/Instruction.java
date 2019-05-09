package fr;

public class Instruction {
    private int operant1;
    private int operant2;
    private String operator;

    public Instruction(int operant1, int operant2, String operator) {
        this.operant1 = operant1;
        this.operant2 = operant2;
        this.operator = operator;
    }

    public int compute() {
        return operant1 + operant2;
    }
}
