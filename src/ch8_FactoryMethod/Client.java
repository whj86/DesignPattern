package ch8_FactoryMethod;

public class Client {
    public static void main(String[] args) {
        NightingaleFactory nightingaleFactory = new StudentFactory();
        Nightingale nightingale = nightingaleFactory.createNightingale();
        nightingale.sweep();
        nightingale.wash();
        nightingale.buyRice();

        System.out.println("---");

        nightingaleFactory = new VolunteerFactory();
        nightingale = nightingaleFactory.createNightingale();
        nightingale.sweep();
        nightingale.wash();
        nightingale.buyRice();
    }
}
