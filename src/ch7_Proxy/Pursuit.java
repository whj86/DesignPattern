package ch7_Proxy;

public class Pursuit implements GiveGift {
    SchoolGirl girl;
    public Pursuit(SchoolGirl girl) {
        this.girl = girl;
    }

    @Override
    public void GiveDolls() {
        System.out.println(girl.getName() + "，送你洋娃娃！");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(girl.getName() + "，送你花！");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(girl.getName() + "，送你巧克力！");
    }
}
