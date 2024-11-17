package ch7_Proxy;

public class Client {
    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl("Miko");
        Proxy proxy = new Proxy(girl);
        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();
    }
}
