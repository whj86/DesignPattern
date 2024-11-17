package ch6_Decorator;

public class Client {
    public static void main(String[] args) {
        Person person = new Person("Jerry");
        Tshirt tshirt = new Tshirt();
        BigTrouser bigTrouser = new BigTrouser();
        Sneakers sneakers = new Sneakers();

        System.out.print("第一種裝扮：");
        tshirt.decorate(person);
        bigTrouser.decorate(tshirt);
        sneakers.decorate(bigTrouser);
        sneakers.show();

        System.out.print("第二種裝扮：");
        sneakers.decorate(person);
        tshirt.decorate(sneakers);
        bigTrouser.decorate(tshirt);
        bigTrouser.show();
    }
}
