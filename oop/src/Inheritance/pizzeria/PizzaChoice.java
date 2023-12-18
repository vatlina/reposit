package Inheritance.pizzeria;

public class PizzaChoice {
    public Pizza createPizza(String type) {
    switch (type) {
        case "1":
            return new PizzaMargarita();
        case "2":
            return new PizzaSalami();
        case "3":
            return new PizzaHawaii();
        default:
            System.out.println("Invalid pizza choice - Неправильный выбор пиццы");
            return null;
    }
}
}