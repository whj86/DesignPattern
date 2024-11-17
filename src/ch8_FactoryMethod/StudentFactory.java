package ch8_FactoryMethod;

public class StudentFactory implements NightingaleFactory {
    @Override
    public Nightingale createNightingale() {
        return new Student();
    }
}
