/*1. Создать класс Student c полями (переменными) имя и возраст. Создать несколько обьектов этого класса. Вывести их на печать*/
public class Student {
        String name;
        int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Миша", 18);
        Student student2 = new Student("Анна", 20);
        Student student3 = new Student("Саша", 26);

        System.out.println("Cтудент 1:");
        student1.displayInfo();

        System.out.println("\nCтудент 2:");
        student2.displayInfo();

        System.out.println("\nCтудент 3:");
        student3.displayInfo();
    }
}
