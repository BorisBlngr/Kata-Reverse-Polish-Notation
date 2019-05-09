package fr;

public class Instruction {
    private int operand1;
    private int operand2;
    private String operator;

    public Instruction(int operand1, int operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public int compute() {
        return operand1 + operand2;
    }
}
