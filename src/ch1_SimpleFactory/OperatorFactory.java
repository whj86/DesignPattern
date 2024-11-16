package ch1_SimpleFactory;

public class OperatorFactory {
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
