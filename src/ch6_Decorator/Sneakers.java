package ch6_Decorator;

public class Sneakers extends Finery {
    @Override
    public void show(){
        System.out.print("球鞋 ");
        super.show();
    }
}
