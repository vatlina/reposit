package Inheritance.pizzeria;

class PizzaHawaii extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pizza Hawaii with ham and pineapple - Приготовление пиццы `Гавайи` с ветчиной и ананасами");
    }
}