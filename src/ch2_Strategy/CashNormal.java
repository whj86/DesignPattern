package ch2_Strategy;

public class CashNormal extends CashSuper {
    @Override
    double acceptCash(double money) {
        return money;
    }
}
