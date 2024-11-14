package ch1;

public class OperatorDiv extends Operator {
    @Override
    String operate(int num1, int num2) {
        try {
            return "num1 / num2 = " + ((float) num1 / num2);
        } catch (ArithmeticException e) {
            return e.getMessage();
        }
    }
}
