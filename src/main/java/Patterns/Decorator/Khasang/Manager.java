package Patterns.Decorator.Khasang;

public class Manager {
    public static void main(String[] args) {
        Baking baking = new Cake();
        System.out.println(baking.getDescription() + " " + baking.getPrice() + " $");
    }
}
