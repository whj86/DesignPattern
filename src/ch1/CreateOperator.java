package ch1;

public class CreateOperator {
    public static Operator createOperator(String operator) {
        return switch (operator) {
            case "+" -> new OperatorAdd();
            case "-" -> new OperatorSub();
            case "*" -> new OperatorMul();
            case "/" -> new OperatorDiv();
            default -> null;
        };
    }
}
