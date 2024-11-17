package ch2_Strategy;

// 打n折
public class CashRebate extends CashSuper {
    private double rebate;
    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    double acceptCash(double money) {
        return money * rebate;
    }
}
