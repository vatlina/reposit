package Inheritance.pizzeria;

import java.util.Scanner;

public class OnlinePizzaShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaChoice pizzaChoice = new PizzaChoice();

        while (true) {
            System.out.println("Choose a pizza: Выберите пиццу 1 - Margarita, 2 - Salami, 3 - Hawaii, Q - Quit Закончить");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("Q")) {
                break;
            }

            Pizza pizza = pizzaChoice.createPizza(choice);
            if (pizza != null) {
                pizza.orderPizza();
            }
        }

        System.out.println("Thank you for visiting our pizza shop! - Спасибо за визит!");
        scanner.close();
    }
}