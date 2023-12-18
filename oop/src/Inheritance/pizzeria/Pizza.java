package Inheritance.pizzeria;

class Pizza {
    public void prepare() {
        System.out.println("Preparing pizza - Приготовление пиццы");
    }

    public void bake() {
        System.out.println("Baking pizza - Выпекание пиццы");
    }

    public void pack() {
        System.out.println("Packing pizza - Упаковка пиццы");
    }

    public void orderPizza() {
        prepare();
        bake();
        pack();
    }
}