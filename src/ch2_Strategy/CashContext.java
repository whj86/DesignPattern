package ch2_Strategy;

import javax.swing.*;

public class CashContext {
    private CashSuper cashSuper;
    public CashContext(String type) {
        switch (type) {
            case "":
                cashSuper = null;
                break;
            case "正常收費":
                cashSuper = new CashNormal();
                break;
            case "打八折":
                cashSuper = new CashRebate(0.8);
                break;
            case "滿300折100":
                cashSuper = new CashReturn(300, 100);
                break;
        }
    }
    public double processedCash(double money) {
        return cashSuper.acceptCash(money);
    }
}
