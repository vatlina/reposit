package Inheritance.pizzeria;

class PizzaSalami extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pizza Salami with salami slices - Приготовление пиццы Салями с кусочками салями");
    }
}