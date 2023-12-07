/*Создать класс Dog c полями name , counter и конструктором. Cоздать несколько обьектов этого класса и вывести на
печать количество созданных обьектов.*/
public class Dog {
    private String name;
    private static int counter = 0;

    public Dog(String name) {
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");
        Dog dog3 = new Dog("Charlie");
        Dog dog4 = new Dog("Bobik");

        System.out.println("Количество созданных объектов Dog: " + Dog.getCounter());
    }
}
