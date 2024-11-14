package ch1;

public class OperatorSub extends Operator {
    @Override
    String  operate(int num1, int num2) {
        return "num1 - num2 = " + (num1 - num2);
    }
}
