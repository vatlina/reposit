package Inheritance.pizzeria;

class PizzaMargarita extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pizza Margarita with mozarella cheese - Приготовление пиццы `Маргарита` с сыром моцарелла");
    }
}