package Patterns.Decorator.Khasang;

public class Cream implements Baking{

    @Override
    public int getPrice() {
        return 12;
    }

    @Override
    public String getDescription() {
        return "with cream";
    }
}
