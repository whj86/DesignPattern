package ch8_FactoryMethod;

public class VolunteerFactory implements NightingaleFactory {
    @Override
    public Nightingale createNightingale() {
        return new Volunteer();
    }
}
