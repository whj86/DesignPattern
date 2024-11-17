package ch2_Strategy;

// 滿x折y
public class CashReturn extends CashSuper {
    private double threshold;
    private double returnMoney;

    public CashReturn(double threshold, double returnMoney) {
        this.threshold = threshold;
        this.returnMoney = returnMoney;
    }

    @Override
    double acceptCash(double money) {
        return money - Math.floor(money / threshold) * returnMoney;
    }
}
