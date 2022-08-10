package Patterns.Decorator.Khasang;

public class Chocolate implements Baking {
    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "with chocolate";
    }
}
