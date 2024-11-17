package ch7_Proxy;

public class Proxy implements GiveGift {
    private Pursuit pursuit;

    public Proxy(SchoolGirl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void GiveDolls() {
        pursuit.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        pursuit.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        pursuit.GiveChocolate();
    }
}
