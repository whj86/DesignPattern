package ch6_Decorator;

public class Tshirt extends Finery{
    @Override
    public void show(){
        System.out.print("Tshirt ");
        super.show();
    }
}
