package ch1_SimpleFactory;

abstract class Operator {
    private int num1;
    private int num2;

    abstract String operate(int num1, int num2);
}
